package com.itau.repository

import com.itau.model.Usuario
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface UsuarioRepository: JpaRepository<Usuario, Long> {


}