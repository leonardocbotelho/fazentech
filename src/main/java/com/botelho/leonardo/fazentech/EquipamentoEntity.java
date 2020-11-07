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
@Table(name = "equipamento")
public class EquipamentoEntity {

    @Id
    @Column(name = "equipamento_id")
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tipo_equipamento_id")
    private TipoEquipamentoEntity tipoEquipamento;
    private String identificacao;
    private LocalDate aquisicao;

}
