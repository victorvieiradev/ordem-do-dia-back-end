package com.codeplus.ordem_do_dia_back_end.infrastructure.persistence.adapter.ordemdodia

import com.codeplus.ordem_do_dia_back_end.infrastructure.persistence.entity.OrdemDoDiaEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrdemDoDiaJpaRepository: JpaRepository<OrdemDoDiaEntity, Long>