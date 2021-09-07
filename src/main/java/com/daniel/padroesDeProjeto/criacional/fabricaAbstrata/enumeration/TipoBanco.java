package com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.enumeration;

public enum TipoBanco {
    ITAU("ITAU"),
    BRADESCO("BRADESCO"),
    NUBANK("NUBANK");

    private String descricao;

    TipoBanco(String n) {
        descricao = n;
    }
}
