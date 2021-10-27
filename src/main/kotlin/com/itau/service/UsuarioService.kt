package com.itau.service

import com.itau.exception.RegistroNaoEncontradoException
import com.itau.model.Usuario
import com.itau.repository.UsuarioRepository
import jakarta.inject.Singleton
import javax.transaction.Transactional

@Singleton
open class UsuarioService(private val usuarioRepository: UsuarioRepository) {


    fun retornaUsuarios(): List<Usuario> {
        return usuarioRepository.findAll();
    }

    fun retornaUsuarioPorId(id: Long): Usuario {
        return usuarioRepository.findById(id).orElseThrow{
            RegistroNaoEncontradoException("Usuario Não Encontrado.")
        }
    }

    fun inserirUsuario(usuario: Usuario): Usuario {
        return usuarioRepository.save(usuario)
    }

    @Transactional
    open fun atualizarUsuario(id: Long, usuario: Usuario): Usuario {
        var usuarioAtual = retornaUsuarioPorId(id)
        usuarioAtual.AtualizaNome(usuario.nome)
        usuarioAtual.AtualizaEmail(usuario.email)
        return usuarioRepository.save(usuarioAtual)
    }

    fun deleteUsuario(id: Long) {
        var usuarioAtual = retornaUsuarioPorId(id)
        usuarioRepository.delete(usuarioAtual)
    }
}