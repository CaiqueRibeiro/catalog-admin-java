package com.caiqueribeiro.admin.catalogo.domain;

import com.caiqueribeiro.admin.catalogo.domain.validation.ValidationHandler;

import java.util.Objects;

public abstract class Entity<ID extends Identifier> {
    protected final ID id;

    public Entity(final ID id) {
        Objects.requireNonNull(id, "'id' should not be null");
        this.id = id;
    }

    public abstract void validate(ValidationHandler handler);

    public ID getId() {
        return this.id;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true; // se for o mesmo objeto
        if (o == null || getClass() != o.getClass()) return false; // se os dois forem mesma classe
        final Entity<?> entity = (Entity<?>) o; // cast para a classe entity
        return getId().equals(entity.getId()); // verifica se possuem o mesmo ID
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
