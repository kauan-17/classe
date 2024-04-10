package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        //Pessoa pessoa = new Pessoa(1.85,76);

        System.out.println("Digite o valor do peso: ");
        pessoa.setPeso((long) sc.nextDouble());
        System.out.println("Digite o valor do altura: ");
        pessoa.setAltura((long) sc.nextDouble());

        System.out.println("IMC = " + pessoa.calcularImc());

    }
}