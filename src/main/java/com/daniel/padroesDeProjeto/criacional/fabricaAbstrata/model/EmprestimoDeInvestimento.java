package com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.model;

public class EmprestimoDeInvestimento extends Emprestimo {
    @Override
    public void getTaxaJuros(double taxaRecebida) {
        taxa = taxaRecebida;
    }
}
