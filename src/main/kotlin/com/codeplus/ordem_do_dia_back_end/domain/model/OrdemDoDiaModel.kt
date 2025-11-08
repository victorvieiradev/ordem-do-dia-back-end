package com.codeplus.ordem_do_dia_back_end.domain.model

import java.time.LocalDate

data class OrdemDoDiaModel(
    val id: Long? = null,
    val titulo: String,
    val descricao: String,
    val data: LocalDate
)