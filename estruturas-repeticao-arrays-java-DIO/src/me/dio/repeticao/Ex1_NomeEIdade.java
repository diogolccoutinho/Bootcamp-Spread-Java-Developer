package me.dio.repeticao;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
Professora Camila Cavalcante DIO
*/
public class Ex1_NomeEIdade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        //equals e para verificar se o valor da string é igual
        //vai ficar no loop ate digitar 0
        while(true) {
            System.out.println("Digite o Nome ou 0 para sair: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui...");

    }

}
