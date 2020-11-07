package com.botelho.leonardo.fazentech;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AnimalService {

    private final AnimalRepository repository;

    public List<AnimalEntity> buscaPorIdentificacao(final String identificacao) {
        return repository.findAllByIdentificacao(identificacao);
    }

    public AnimalEntity salva(final AnimalEntity animal) {
        return repository.save(animal);
    }

}
