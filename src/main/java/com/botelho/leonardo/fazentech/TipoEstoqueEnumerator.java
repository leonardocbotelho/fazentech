package com.botelho.leonardo.fazentech;

public enum TipoEstoqueEnumerator {
    ENTRADA(1),
    SAIDA(2);

    private Integer tipo;

    TipoEstoqueEnumerator(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer tipo() {
        return this.tipo;
    }

}
