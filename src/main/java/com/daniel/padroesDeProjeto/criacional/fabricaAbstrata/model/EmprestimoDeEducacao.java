package com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.model;

public class EmprestimoDeEducacao extends Emprestimo {
    @Override
    public void getTaxaJuros(double taxaRecebida) {
        taxa = taxaRecebida;
    }
}
