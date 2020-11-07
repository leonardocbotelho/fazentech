package com.botelho.leonardo.fazentech;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipamentoRepository extends JpaRepository<EquipamentoEntity, Long> {

    List<EquipamentoEntity> findAllByIdentificacao(String identicicacao);

}
