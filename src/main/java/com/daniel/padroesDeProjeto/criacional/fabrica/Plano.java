package com.daniel.padroesDeProjeto.criacional.fabrica;

public abstract class Plano {

    protected double taxa;

    abstract void getValor();


    public void calcular(int unidade) {
        getValor();
        System.out.println(unidade * taxa);
    }
}
