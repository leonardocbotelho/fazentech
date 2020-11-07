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
@Table(name = "cargo")
public class CargoEntity {

    @Id
    @Column(name = "cargo_id")
    private Long id;
    private String nome;
    @Column(columnDefinition = "decimal(10,2)")
    private Double salario;

}
