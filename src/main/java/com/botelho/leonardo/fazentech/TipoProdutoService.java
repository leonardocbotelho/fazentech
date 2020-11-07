package com.botelho.leonardo.fazentech;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TipoProdutoService {

    private final TipoProdutoRepository repository;

    public List<TipoProdutoEntity> buscaPorNome(final String nome) {
        return repository.findAllByNome(nome);
    }

    public TipoProdutoEntity salva(final TipoProdutoEntity tipoProduto) {
        return repository.save(tipoProduto);
    }

}
