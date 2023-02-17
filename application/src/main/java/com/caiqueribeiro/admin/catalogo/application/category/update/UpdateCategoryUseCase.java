package com.caiqueribeiro.admin.catalogo.application.category.update;

import com.caiqueribeiro.admin.catalogo.application.UseCase;
import com.caiqueribeiro.admin.catalogo.domain.validation.handler.Notification;
import io.vavr.control.Either;

public abstract class UpdateCategoryUseCase
        extends UseCase<UpdateCategoryCommand, Either<Notification, UpdateCategoryOutput>> {
}
