package com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.model;

import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.enumeration.TipoBanco;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.interfaces.Banco;

public class BRADESCO implements Banco {

    private final TipoBanco tipoBanco;

    public BRADESCO() {
        this.tipoBanco = TipoBanco.BRADESCO;
    }

    @Override
    public TipoBanco getBanco() {
        return tipoBanco;
    }
}
