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
@Table(name = "animal")
public class AnimalEntity {

    @Id
    @Column(name = "animal_id")
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "especie_id")
    private EspecieEntity especie;
    private String identificacao;
    private String nome;
    private LocalDate nascimento;
    private LocalDate aquisicao;
    private Boolean inseminacao;
    private Integer ruminacao;

}
