package com.botelho.leonardo.fazentech;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TipoEquipamentoService {

    private final TipoEquipamentoRepository repository;

    public List<TipoEquipamentoEntity> buscaPorNome(final String nome) {
        return repository.findAllByNome(nome);
    }

    public TipoEquipamentoEntity salva(final TipoEquipamentoEntity tipoEquipamento) {
        return repository.save(tipoEquipamento);
    }

}
