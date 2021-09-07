package com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.factory;

import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.enumeration.TipoBanco;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.enumeration.TipoEmprestimo;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.interfaces.Banco;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.model.Emprestimo;

public abstract class FabricaAbstrata {

    public abstract Banco pegarBanco(TipoBanco tipoBanco);

    public abstract Emprestimo pegarEmprestimo(TipoEmprestimo tipoEmprestimo);
}
