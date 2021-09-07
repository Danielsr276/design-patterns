package com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.factory;

import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.enumeration.TipoBanco;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.enumeration.TipoEmprestimo;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.interfaces.Banco;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.model.Emprestimo;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.model.EmprestimoDeCasa;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.model.EmprestimoDeEducacao;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.model.EmprestimoDeInvestimento;

public class EmprestimoFabrica extends FabricaAbstrata {

    @Override
    public Banco pegarBanco(TipoBanco tipoBanco) {
        return null;
    }

    @Override
    public Emprestimo pegarEmprestimo(TipoEmprestimo tipoEmprestimo) {
        switch (tipoEmprestimo) {
            case CASA:
                return new EmprestimoDeCasa();
            case INVESTIMENTO:
                return new EmprestimoDeInvestimento();
            case EDUCACAO:
                return new EmprestimoDeEducacao();
            default:
                return null;
        }
    }
}
