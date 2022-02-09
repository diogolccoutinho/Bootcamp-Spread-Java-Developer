package me.dio.array;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
Professora Camila Cavalcante
*/

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        //Vetor para captar os números aleatórios
        int[] numerosAleatorios = new int[20];

        //Laço para preencher o vetor com num de 0 a 100
        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        //Impriminto os números captados
        System.out.print("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        //Imprimindo seus antecessores(bônus)
        System.out.print("\nAntecessor dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }

        //Imprimindo seus sucessores
        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

    }

}
