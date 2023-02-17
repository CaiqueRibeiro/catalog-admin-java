package com.caiqueribeiro.admin.catalogo.domain.validation;

import java.util.List;

public interface ValidationHandler {
    ValidationHandler append(Error anError);
    ValidationHandler append(ValidationHandler aHandler);
    ValidationHandler validate(Validation validation);

    List<Error> getErrors();

    default boolean hasError() {
        return getErrors() != null && !(getErrors().isEmpty());
    }

    default Error firstError() {
        if(getErrors() != null && !getErrors().isEmpty()) {
            return getErrors().get(0);
        } else {
            return null;
        }
    }

    public interface Validation {
        void validate();
    }
}