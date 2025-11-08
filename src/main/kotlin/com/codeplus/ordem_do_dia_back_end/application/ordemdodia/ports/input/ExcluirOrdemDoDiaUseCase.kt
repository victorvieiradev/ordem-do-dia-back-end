package com.codeplus.ordem_do_dia_back_end.application.ordemdodia.ports.input

interface ExcluirOrdemDoDiaUseCase {
    fun executar(id: Long)
}