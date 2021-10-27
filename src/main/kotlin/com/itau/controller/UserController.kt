package com.itau.controller

import com.itau.model.Usuario
import com.itau.service.UsuarioService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*
import jakarta.inject.Inject
import javax.transaction.Transactional

@Controller("/user")
class UserController(@Inject val usuarioService: UsuarioService) {

    @Get()
    fun getUsuarios() : List<Usuario> {
        return usuarioService.retornaUsuarios()
    }

    @Get("{id}")
    fun getUsuario(@PathVariable id: Long) : Usuario? {
        return usuarioService.retornaUsuarioPorId(id)
    }

    @Post()
    fun postUsuario(@Body usuario: Usuario): HttpResponse<Usuario> {
        val usuario = usuarioService.inserirUsuario(usuario)
        return HttpResponse.created(usuario)
    }

    @Put("{id}")
    fun putUsuario(@PathVariable id: Long, @Body usuario: Usuario): HttpResponse<Usuario> {
        val usuario = usuarioService.atualizarUsuario(id, usuario)
        return HttpResponse.ok(usuario)
    }

    @Delete("{id}")
    fun deleteUsuario(@PathVariable id: Long): HttpResponse<Unit> {
        usuarioService.deleteUsuario(id)
        return HttpResponse.noContent()
    }

}