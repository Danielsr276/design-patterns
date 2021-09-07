package com.daniel.padroesDeProjeto.criacional.fabricaAbstrata.model;

public abstract class Emprestimo {

    protected double taxa;

    public abstract void getTaxaJuros(double taxa);

    public void calcularPagamentoEmprestimo(double valorEmprestimo, int anos) {
/*
        para calcular o pagamento mensal do empréstimo, ou seja, PARCELA

        taxa = taxa de juros anual / 12 * 100;
        n = número de parcelas mensais;
        1 ano = 12 meses.
            então, n = anos * 12;
*/

        double PARCELA;
        int n;


        n = anos * 12;
        taxa = taxa / 1200;
        PARCELA = ((taxa * Math.pow((1 + taxa), n)) / ((Math.pow((1 + taxa), n)) - 1)) * valorEmprestimo;
        double valorTotal = PARCELA * n;

        System.out.println("Sua parcela mensal é :" + String.format("%.2f", PARCELA) + " para o valor: " + valorEmprestimo + " que vc pediu  emprestado!");
        System.out.println("O valor total a ser pago é :" + String.format("%.2f", valorTotal));

    }
}
