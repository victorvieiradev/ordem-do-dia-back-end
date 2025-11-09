package com.codeplus.ordem_do_dia_back_end.application.ordemdodia.ports.output

import com.codeplus.ordem_do_dia_back_end.domain.model.OrdemDoDiaModel

interface CriarOrdemDoDiaRepositoryPort {
    fun salvar(ordemDoDiaModel: OrdemDoDiaModel): OrdemDoDiaModel
    }