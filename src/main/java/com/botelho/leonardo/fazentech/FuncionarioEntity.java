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
@Table(name = "funcionario")
public class FuncionarioEntity {

    @Id
    @Column(name = "funcionario_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "cargo_id")
    private CargoEntity cargo;
    private String nome;
    private String cpf;
    private LocalDate admissao;
    private LocalDate demissao;

}
