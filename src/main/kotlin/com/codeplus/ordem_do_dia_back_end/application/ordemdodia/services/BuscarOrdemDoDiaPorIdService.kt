package com.codeplus.ordem_do_dia_back_end.application.ordemdodia.services

import com.codeplus.ordem_do_dia_back_end.application.ordemdodia.ports.input.BuscarOrdemDoDiaPorIdUseCase
import com.codeplus.ordem_do_dia_back_end.domain.model.OrdemDoDiaModel

class BuscarOrdemDoDiaPorIdService : BuscarOrdemDoDiaPorIdUseCase {
    override fun executar(id: Long): OrdemDoDiaModel? {
        TODO("Not yet implemented")
    }
}