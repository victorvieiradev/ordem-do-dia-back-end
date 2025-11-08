package com.codeplus.ordem_do_dia_back_end.application.ports.output

import com.codeplus.ordem_do_dia_back_end.domain.model.OrdemDoDiaModel

interface OrdemDoDiaRepositoryPort {
    fun salvar(ordemDoDia: OrdemDoDiaModel): OrdemDoDiaModel
    fun listarTodos(): List<OrdemDoDiaModel>
    fun buscarPorId(id: Long): OrdemDoDiaModel?
    fun deletar(id: Long)
}