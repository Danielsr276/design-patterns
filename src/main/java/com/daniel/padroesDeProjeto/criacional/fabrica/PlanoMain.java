package com.daniel.padroesDeProjeto.criacional.fabrica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.util.Arrays.stream;

public class PlanoMain {

    public static void main(String[] args) throws IOException {


        PlanoFabrica planoFabrica = new PlanoFabrica();

        stream(TipoPlano.values()).forEach(System.out::println);
        System.out.println("Digite um dos planos acima para calcular?");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TipoPlano tipoPlano = TipoPlano.valueOf(br.readLine());

        System.out.println("Digite quantas unidades deve calcular?");

        Integer unidades = Integer.valueOf(br.readLine());

        Plano plano = planoFabrica.pegarPlano(tipoPlano);

        System.out.println("O plano: " + tipoPlano);
        System.out.println("Para: " + unidades + " unidades é: ");

        plano.calcular(unidades);
    }
}
