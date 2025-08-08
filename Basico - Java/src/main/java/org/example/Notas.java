package org.example;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String status;

        System.out.println("Digite seu nome: ");
        String nome = ler.next();

        System.out.println("Digite sua primeira nota: ");
        double primeiranota = ler.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double segundanota = ler.nextDouble();

        double notatotal = primeiranota + segundanota;

        double media = notatotal / 2;

        if (media < 7){
            status = "Reprovado";
        }else {
            status = "Aprovado";
        }

        System.out.println("Aluno: " + nome + " Sua média é: " + media);
        System.out.println("Stats: " + status +".");







    }
}
