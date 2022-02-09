package me.dio.array;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
Professora Camila Cavalcante DIO
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        //Comando para mostrar o número de elementos do vetor
        System.out.println(vetor.length);

        //Laço para percorrer o vetor e mostrar seus elementos
        System.out.print("Vetor: ");
        int count =0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        //Laço para mostrar o vetor na ordem inversa
        System.out.print("\nVetor Inverso: ");
        for(int i = (vetor.length - 1); i >= 0; i --) {
            System.out.print(vetor[i] + " ");
        }

    }
}
