package com.daniel.padroesDeProjeto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.daniel.padroesDeProjeto.criacional.fabrica.model.Plano;
import com.daniel.padroesDeProjeto.criacional.fabrica.model.PlanoComercial;
import com.daniel.padroesDeProjeto.criacional.fabrica.model.PlanoDomestico;
import com.daniel.padroesDeProjeto.criacional.fabrica.factory.PlanoFabrica;
import com.daniel.padroesDeProjeto.criacional.fabrica.model.PlanoInstitucional;
import com.daniel.padroesDeProjeto.criacional.fabrica.enumeration.TipoPlano;

import static org.junit.jupiter.api.Assertions.assertThrows;

class PlanoFabricaTest {

    PlanoFabrica planoFabrica;

    @BeforeEach
    void init() {
        planoFabrica = new PlanoFabrica();
    }

    @Test
    void deveCriarPlanoComercial() {
        Plano plano = planoFabrica.pegarPlano(TipoPlano.COMERCIAL);

        assert plano instanceof PlanoComercial;
    }

    @Test
    void deveCriarPlanoDomestico() {
        Plano plano = planoFabrica.pegarPlano(TipoPlano.DOMESTICO);

        assert plano instanceof PlanoDomestico;
    }

    @Test
    void deveCriarPlanoInstitucional() {
        Plano plano = planoFabrica.pegarPlano(TipoPlano.INSTITUCIONAL);

        assert plano instanceof PlanoInstitucional;
    }

    @Test
    void deveRetornarExcecao() {
        assertThrows(IllegalArgumentException.class,
            () -> planoFabrica.pegarPlano(TipoPlano.valueOf("anything")));

        assertThrows(NullPointerException.class,
            () -> planoFabrica.pegarPlano(null));
    }

}
