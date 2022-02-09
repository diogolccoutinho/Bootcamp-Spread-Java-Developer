package me.dio.array;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
Professora Camila Cavalcante DIO
*/
public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        //Criando o vetor bidimencional
        int[][] M = new int[4][4];

        //Preenchendo a matris
        for(int i = 0; i < M.length; i++) {
            for( int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);
            }
        }

        //Imprimindo a matriz
        System.out.println("Matriz: ");
        for (int[] linha : M  ) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }

    }

}
