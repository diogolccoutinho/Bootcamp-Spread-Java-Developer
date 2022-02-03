package me.dio.tiposDados;

/**
 * Classe de exemplo para o exercício da Aula 2 de Variáveis, Tipos de Dados e Operadores aritméticos.
 * Professor Tiago Leite
 */
public class Main {

    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; O tamanho está ultrapassando o limite

        //int i1 = -10000000000; O tamanho está ultrapassando o limite inferior
        int i2 = 28500;

        long l1 = 1000000000000000000L;
        long l2 = 2004005000500055000L;

        //float f1 = 4.5; Devo colocar o f para definir
        float f2 = 10.68F;

        double d1 = 85.69; //Mais usado em números fracionados
        double d2 = 99.04D;

        char c1 = 'W';
        //char c2 = 'Tw';
        char c3 = '\u0057'; //unicode do w

        String st1 = "Fulano";// Não é um dado primitivo mas é o mais comum usado para texto
        String st2 = "Cicrano";
        String st3 = "ag dgb se  se et t KNBJBJBB &*¨&%& 75894389";

        //String dt1 = "09/02/1981";// O tipo adequado é uma outra classo date

        boolean bo1 = true; // ele aceita somente essas duas possibilidades
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);

    }


}
