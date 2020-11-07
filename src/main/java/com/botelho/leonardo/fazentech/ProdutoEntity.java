package com.botelho.leonardo.fazentech;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "produto")
public class ProdutoEntity {

    @Id
    @Column(name = "produto_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "tipo_produto_id")
    private TipoProdutoEntity tipoProduto;
    private String nome;
    @Column(columnDefinition = "decimal(10,2)")
    private Double preco;
    private Integer quantidade;

}
