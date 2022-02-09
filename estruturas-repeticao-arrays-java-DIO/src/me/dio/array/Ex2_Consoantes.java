package me.dio.array;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
Professora Camila Cavalcante DIO
*/

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //vetor consoantes
        String[] consoantes = new String[6];
        //Número de consoantes digitadas
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            //Lendo as letras digitadas
            System.out.println("Letra: ");
            String letra = scan.next();

            //Comparando se são vogais, Ignore Case e para ler maiuscula e minuscula
            if ( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) )  {
                //Só vai entrar nesse vetor se for difrerente de vogal
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;

        } while(count < consoantes.length);

        //Mostrar de consoantes digitadas e a quantidade
        System.out.print("Consoantes: ");
        for ( String consoante  :  consoantes ) {
            if ( consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.println(consoantes.length);

    }

}
