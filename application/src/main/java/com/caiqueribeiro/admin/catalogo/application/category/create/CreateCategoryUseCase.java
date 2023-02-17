package com.caiqueribeiro.admin.catalogo.application.category.create;

import com.caiqueribeiro.admin.catalogo.application.UseCase;
import com.caiqueribeiro.admin.catalogo.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class CreateCategoryUseCase
        extends UseCase<CreateCategoryCommand, Either<Notification, CreateCategoryOutput>> {
}
