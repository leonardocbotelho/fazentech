package com.botelho.leonardo.fazentech;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Long> {

    List<FuncionarioEntity> findAllByNome(String nome);
    List<FuncionarioEntity> findAllByCpf(String cpf);

}
