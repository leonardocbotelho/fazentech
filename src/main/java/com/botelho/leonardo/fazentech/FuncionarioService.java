package com.botelho.leonardo.fazentech;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FuncionarioService {

    private final FuncionarioRepository repository;

    public List<FuncionarioEntity> buscaPorNome(final String nome) {
        return repository.findAllByNome(nome);
    }

    public FuncionarioEntity salva(final FuncionarioEntity funcionario) {
        return repository.save(funcionario);
    }

}
