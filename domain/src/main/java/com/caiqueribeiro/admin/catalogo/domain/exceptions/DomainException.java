package com.caiqueribeiro.admin.catalogo.domain.exceptions;

import com.caiqueribeiro.admin.catalogo.domain.validation.Error;

import java.util.List;

public class DomainException extends NoStackTraceException {

    private final List<Error> errors;

    private DomainException(final String aMessage, List<Error> errors) {
        super(aMessage);
        this.errors = errors;
    }

    public static DomainException with(final Error anError) {
        return new DomainException(anError.message(), List.of(anError));
    }

    public static DomainException with(final List<Error> errors) {
        return new DomainException("", errors);
    }

    public List<Error> getErrors() {
        return this.errors;
    }
}
