package com.botelho.leonardo.fazentech;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EquipamentoService {

    private final EquipamentoRepository repository;

    public List<EquipamentoEntity> buscaPorIdentificacao(final String identificacao) {
        return repository.findAllByIdentificacao(identificacao);
    }

    public EquipamentoEntity salva(final EquipamentoEntity equipamento) {
        return repository.save(equipamento);
    }

}
