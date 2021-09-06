package com.daniel.padroesDeProjeto.criacional.fabrica;

public class PlanoFabrica {

    //usar o metodo pegarPlano par obter o tipo do objeto Plano
    public Plano pegarPlano(TipoPlano tipoDoPlano) {

        switch (tipoDoPlano) {
            case COMERCIAL:
                return new PlanoComercial();

            case DOMESTICO:
                return new PlanoDomestico();
            case INSTITUCIONAL:
                return new PlanoInstitucional();

            default:
                return null;
        }
    }
}
