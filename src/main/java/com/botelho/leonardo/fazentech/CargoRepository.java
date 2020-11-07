package com.botelho.leonardo.fazentech;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CargoRepository extends JpaRepository<CargoEntity, Long> {

    List<CargoEntity> findAllByNome(String nome);

}
