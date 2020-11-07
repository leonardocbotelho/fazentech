package com.botelho.leonardo.fazentech;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EspecieRepository extends JpaRepository<EspecieEntity, Long> {

    List<EspecieEntity> findAllByNome(String nome);

}
