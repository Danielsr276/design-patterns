package com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.factory;

import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.enumeration.TipoFabrica;

public class CriadorFabrica {

    public static FabricaAbstrata pegarFabrica(TipoFabrica tipoFabrica) {
        switch (tipoFabrica) {
            case BANCO:
                return new BancoFabrica();
            case EMPRESTIMO:
                return new EmprestimoFabrica();
            default:
                return null;
        }
    }
}
