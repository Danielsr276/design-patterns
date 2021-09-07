package com.daniel.padroesDeProjeto.criacional.fabricaAbstrata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.enumeration.TipoBanco;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.enumeration.TipoEmprestimo;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.enumeration.TipoFabrica;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.factory.CriadorFabrica;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.factory.FabricaAbstrata;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.interfaces.Banco;
import com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.model.Emprestimo;

import static java.util.Arrays.stream;

public class PadraoFabricaAbstrataExemplo {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Digite o nome do banco, por exemplo:");
        stream(TipoBanco.values()).forEach(System.out::println);
        TipoBanco tipoBanco = TipoBanco.valueOf(br.readLine());

        System.out.println("Digite o tipo de empréstimo, por exemplo:");
        stream(TipoEmprestimo.values()).forEach(System.out::println);

        TipoEmprestimo tipoEmprestimo = TipoEmprestimo.valueOf(br.readLine());
        FabricaAbstrata fabricaAbstrata = CriadorFabrica.pegarFabrica(TipoFabrica.BANCO);
        Banco b = fabricaAbstrata.pegarBanco(tipoBanco);

        System.out.println("Digite a taxa de juros do banco " + b.getBanco() + ":");

        double taxa = Double.parseDouble(br.readLine());
        System.out.println("Digite o valor do empréstimo:");

        double loanAmount = Double.parseDouble(br.readLine());
        System.out.println("Digite o número de anos para pagar:");
        int anos = Integer.parseInt(br.readLine());

        System.out.println("você está tomando o empréstimo de " + b.getBanco());

        FabricaAbstrata loanFactory = CriadorFabrica.pegarFabrica(TipoFabrica.EMPRESTIMO);
        Emprestimo emprestimo = loanFactory.pegarEmprestimo(tipoEmprestimo);
        emprestimo.getTaxaJuros(taxa);
        emprestimo.calcularPagamentoEmprestimo(loanAmount, anos);

    }


}
