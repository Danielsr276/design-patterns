package com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.model;

import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.enumeration.TipoBanco;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.interfaces.Banco;

public class NUBANK implements Banco {

    private final TipoBanco tipoBanco;

    public NUBANK() {
        this.tipoBanco = TipoBanco.NUBANK;
    }

    @Override
    public TipoBanco getBanco() {
        return tipoBanco;
    }
}
