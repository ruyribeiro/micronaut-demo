package com.itau.model

import java.math.BigDecimal
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Conta(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long,
        var idUsuario: Long,
        var saldo: BigDecimal
) {

}