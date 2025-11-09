package com.codeplus.ordem_do_dia_back_end.infrastructure.persistence.adapter.ordemdodia

import com.codeplus.ordem_do_dia_back_end.application.ordemdodia.ports.output.CriarOrdemDoDiaRepositoryPort
import com.codeplus.ordem_do_dia_back_end.domain.model.OrdemDoDiaModel

class CriarOrdemDoDiaRepositoryAdapter(
    private val repository: OrdemDoDiaJpaRepository
) : CriarOrdemDoDiaRepositoryPort {
    override fun salvar(ordemDoDiaModel: OrdemDoDiaModel): OrdemDoDiaModel {
        TODO("Not yet implemented")
    }
}