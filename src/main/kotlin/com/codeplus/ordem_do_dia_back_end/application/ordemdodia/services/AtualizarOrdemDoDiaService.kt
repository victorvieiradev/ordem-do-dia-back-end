package com.codeplus.ordem_do_dia_back_end.application.ordemdodia.services

import com.codeplus.ordem_do_dia_back_end.application.ordemdodia.ports.input.AtualizarOrdemDoDiaUseCase
import com.codeplus.ordem_do_dia_back_end.application.ordemdodia.ports.input.ExcluirOrdemDoDiaUseCase
import com.codeplus.ordem_do_dia_back_end.domain.model.OrdemDoDiaModel

class AtualizarOrdemDoDiaService : AtualizarOrdemDoDiaUseCase {
    override fun executar(
        id: Long,
        ordemDoDiaModel: OrdemDoDiaModel
    ): ExcluirOrdemDoDiaUseCase {
        TODO("Not yet implemented")
    }
}