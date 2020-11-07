package com.botelho.leonardo.fazentech;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "tipo_equipamento")
public class TipoEquipamentoEntity {

    @Id
    @Column(name = "tipo_equipamento_id")
    private Long id;
    private String nome;

}
