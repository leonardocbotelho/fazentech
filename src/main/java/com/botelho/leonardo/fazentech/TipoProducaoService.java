package com.botelho.leonardo.fazentech;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TipoProducaoService {

    private final TipoProducaoRepository repository;

    public List<TipoProducaoEntity> buscaPorNome(final String nome) {
        return repository.findAllByNome(nome);
    }

    public TipoProducaoEntity salva(final TipoProducaoEntity tipoProducao) {
        return repository.save(tipoProducao);
    }

}
