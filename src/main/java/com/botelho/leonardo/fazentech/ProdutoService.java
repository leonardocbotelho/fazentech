package com.botelho.leonardo.fazentech;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public List<ProdutoEntity> buscaPorNome(final String nome) {
        return repository.findAllByNome(nome);
    }

    public ProdutoEntity salva(final ProdutoEntity produto) {
        return repository.save(produto);
    }

}
