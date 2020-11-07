package com.botelho.leonardo.fazentech;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimalRepository extends JpaRepository<AnimalEntity, Long> {

    List<AnimalEntity> findAllByIdentificacao(String identicicacao);

}
