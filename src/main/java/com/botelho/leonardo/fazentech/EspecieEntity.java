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
@Table(name = "especie")
public class EspecieEntity {

    @Id
    @Column(name = "especie_id")
    private Long id;
    private String nome;

}
