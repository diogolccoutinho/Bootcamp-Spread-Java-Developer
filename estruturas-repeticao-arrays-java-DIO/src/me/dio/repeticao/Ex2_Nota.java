package me.dio.repeticao;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
Professora Camila Cavalcante DIO
*/
public class Ex2_Nota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        //Recebe o valor da nota
        System.out.println("Nota: ");
        nota = scan.nextInt();

        //Se o valor for de 0 a 10 para o programa se não entra no while
        while(nota < 0 | nota > 10) {
            System.out.println("Nota Inválida! Digite novamente: ");
            nota = scan.nextInt();
        }

    }

}
