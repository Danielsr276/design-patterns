package com.daniel.padroesDeProjeto.criacional.fabrica.factory;

import com.daniel.padroesDeProjeto.criacional.fabrica.enumeration.TipoPlano;
import com.daniel.padroesDeProjeto.criacional.fabrica.model.Plano;
import com.daniel.padroesDeProjeto.criacional.fabrica.model.PlanoComercial;
import com.daniel.padroesDeProjeto.criacional.fabrica.model.PlanoDomestico;
import com.daniel.padroesDeProjeto.criacional.fabrica.model.PlanoInstitucional;

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
