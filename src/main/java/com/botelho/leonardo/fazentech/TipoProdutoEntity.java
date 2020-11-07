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
@Table(name = "tipo_produto")
public class TipoProdutoEntity {

    @Id
    @Column(name = "tipo_produto_id")
    private Long id;
    private String nome;

}
