package com.botelho.leonardo.fazentech;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TipoProdutoRepository extends JpaRepository<TipoProdutoEntity, Long> {

    List<TipoProdutoEntity> findAllByNome(String nome);

}
