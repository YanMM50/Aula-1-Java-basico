package org.example;

public class Loja {
    public static void main(String[] args) {
        int biscoito = 4;
        int refri = 6;

        double total = biscoito + refri;
        double prestacoes = total / 5;

        System.out.println("==== Mamão com Açúcar ====");
        System.out.println("valor total: R$" + total);
        System.out.println("Prestações em 5x de R$" + prestacoes);
    }
}
