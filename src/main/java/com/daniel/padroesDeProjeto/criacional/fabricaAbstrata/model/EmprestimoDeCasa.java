package com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.model;

public class EmprestimoDeCasa extends Emprestimo {
    @Override
    public void getTaxaJuros(double taxaRecebida) {
        taxa = taxaRecebida;
    }
}
