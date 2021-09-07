package com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.model;

import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.enumeration.TipoBanco;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.interfaces.Banco;

public class ITAU implements Banco {

    private final TipoBanco tipoBanco;

    public ITAU() {
        this.tipoBanco = TipoBanco.ITAU;
    }

    @Override
    public TipoBanco getBanco() {
        return tipoBanco;
    }
}
