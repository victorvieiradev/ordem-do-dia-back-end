package com.codeplus.ordem_do_dia_back_end.application.ordemdodia.ports.input

import com.codeplus.ordem_do_dia_back_end.domain.model.OrdemDoDiaModel

interface BuscarOrdemDoDiaPorIdUseCase {
    fun executar(id: Long): OrdemDoDiaModel?

}