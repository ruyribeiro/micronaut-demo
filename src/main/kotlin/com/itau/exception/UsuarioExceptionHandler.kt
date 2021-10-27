package com.itau.exception

import io.micronaut.context.annotation.Requires
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.server.exceptions.ExceptionHandler
import jakarta.inject.Singleton

@Singleton
@Requires(classes = [RegistroNaoEncontradoException::class])
class UsuarioExceptionHandler: ExceptionHandler<RegistroNaoEncontradoException, HttpResponse<*>> {

    override fun handle(request: HttpRequest<*>?, exception: RegistroNaoEncontradoException?): MutableHttpResponse<MensagemErro>? {
        return HttpResponse.notFound<MensagemErro>().body(MensagemErro(exception?.message))
    }

}