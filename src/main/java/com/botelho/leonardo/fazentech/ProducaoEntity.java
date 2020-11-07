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
@Table(name = "producao")
public class ProducaoEntity {

    @Id
    @Column(name = "producao_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "tipo_producao_id")
    private TipoProducaoEntity tipoProducao;
    @ManyToOne
    @JoinColumn(name = "tipo_produto_id")
    private TipoProdutoEntity tipoProduto;
    @ManyToOne
    @JoinColumn(name = "animal_id")
    private AnimalEntity animal;
    @ManyToOne
    @JoinColumn(name = "equipamento_id")
    private EquipamentoEntity equipamento;
    private LocalDate momento;
    private Double quantidade;
    private Double temperatura;
    private Integer secagem;

}
