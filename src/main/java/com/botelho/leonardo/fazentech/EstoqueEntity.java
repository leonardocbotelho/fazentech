package com.botelho.leonardo.fazentech;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "estoque")
public class EstoqueEntity {

    @Id
    @Column(name = "estoque_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private FuncionarioEntity funcionario;
    @ManyToOne
    @JoinColumn(name = "produto_id")
    private ProdutoEntity produto;
    private LocalDate momento;
    private Double quantidade;
    private TipoEstoqueEnumerator tipo;

}
