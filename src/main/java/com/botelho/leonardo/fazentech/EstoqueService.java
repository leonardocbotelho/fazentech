package com.botelho.leonardo.fazentech;

import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Objects;

@AllArgsConstructor
@Service
public class EstoqueService {

    private final FuncionarioRepository funcionarioRepository;
    private final ProdutoRepository produtoRepository;
    private final EstoqueRepository estoqueRepository;

    public EstoqueEntity insereEstoque(final String cpfFuncionario,
                                       final String nomeProduto,
                                       final Double quantidade,
                                       final TipoEstoqueEnumerator tipo) throws NotFoundException {

        final FuncionarioEntity funcionario = funcionarioRepository.findAllByCpf(cpfFuncionario).stream().findFirst()
                .orElse(null);

        if (Objects.isNull(funcionario))
            throw new NotFoundException("FUNCIONARIO COM CPF {} NAO EXISTE".concat(cpfFuncionario));

        final ProdutoEntity produto = produtoRepository.findAllByNome(nomeProduto).stream().findFirst()
                .orElse(null);

        if (Objects.isNull(produto))
            throw new NotFoundException("PRODUTO COM CNOME {} NAO EXISTE".concat(nomeProduto));

        return estoqueRepository.save(EstoqueEntity.builder()
                .funcionario(funcionario)
                .produto(produto)
                .momento(LocalDate.now())
                .quantidade(quantidade)
                .tipo(tipo)
                .build());

    }

}
