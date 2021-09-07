package com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.factory;

import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.enumeration.TipoBanco;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.enumeration.TipoEmprestimo;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.interfaces.Banco;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.model.BRADESCO;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.model.Emprestimo;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.model.ITAU;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.model.NUBANK;

public class BancoFabrica extends FabricaAbstrata {

    @Override
    public Banco pegarBanco(TipoBanco tipoBanco) {
        switch (tipoBanco) {
            case ITAU:
                return new ITAU();
            case BRADESCO:
                return new BRADESCO();
            case NUBANK:
                return new NUBANK();
            default:
                return null;
        }
    }

    @Override
    public Emprestimo pegarEmprestimo(TipoEmprestimo tipoEmprestimo) {
        return null;
    }
}
