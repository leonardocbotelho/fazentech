package com.botelho.leonardo.fazentech;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipoProducaoRepository extends JpaRepository<TipoProducaoEntity, Long> {

    List<TipoProducaoEntity> findAllByNome(String nome);

}
