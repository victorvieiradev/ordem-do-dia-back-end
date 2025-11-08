package com.codeplus.ordem_do_dia_back_end.application.ports.input

import com.codeplus.ordem_do_dia_back_end.domain.model.OrdemDoDiaModel

interface OrdemDoDiaUseCase {
    fun criar(ordemDoDia: OrdemDoDiaModel): OrdemDoDiaModel
    fun listarTodos(): List<OrdemDoDiaModel>
    fun buscarPorId(id: Long): OrdemDoDiaModel?
    fun atualizar(id: Long, ordemDoDia: OrdemDoDiaModel): OrdemDoDiaUseCase
    fun deletar(id: Long)
}