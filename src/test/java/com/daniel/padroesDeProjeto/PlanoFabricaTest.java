package com.daniel.padroesDeProjeto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.daniel.padroesDeProjeto.criacional.fabrica.Plano;
import com.daniel.padroesDeProjeto.criacional.fabrica.PlanoComercial;
import com.daniel.padroesDeProjeto.criacional.fabrica.PlanoDomestico;
import com.daniel.padroesDeProjeto.criacional.fabrica.PlanoFabrica;
import com.daniel.padroesDeProjeto.criacional.fabrica.PlanoInstitucional;
import com.daniel.padroesDeProjeto.criacional.fabrica.TipoPlano;

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
