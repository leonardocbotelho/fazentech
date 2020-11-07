package com.botelho.leonardo.fazentech;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EspecieService {

    private final EspecieRepository repository;

    public List<EspecieEntity> buscaPorNome(final String nome) {
        return repository.findAllByNome(nome);
    }

    public EspecieEntity salva(final EspecieEntity especie) {
        return repository.save(especie);
    }

}
