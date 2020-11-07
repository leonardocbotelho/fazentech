package com.botelho.leonardo.fazentech;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CargoService {

    private final CargoRepository repository;

    public List<CargoEntity> buscaPorNome(final String nome) {
        return repository.findAllByNome(nome);
    }

    public CargoEntity salva(final CargoEntity cargo) {
        return repository.save(cargo);
    }

}
