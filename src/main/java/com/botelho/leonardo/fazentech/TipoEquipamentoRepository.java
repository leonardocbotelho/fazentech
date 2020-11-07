package com.botelho.leonardo.fazentech;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipoEquipamentoRepository extends JpaRepository<TipoEquipamentoEntity, Long> {

    List<TipoEquipamentoEntity> findAllByNome(String nome);

}
