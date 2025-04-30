package com.mauricioxavier.maratonajava.introducao;

public class Aula4Operadores {
    public static void main(String[] args) {
        // + - * /
       int numero1 = 10;
       int numero2 = 20;
       double resultado = numero1 / (double) numero2;
        System.out.println(resultado);

        // %
        int resto = 249 % 3;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isTrintaMaiorVinte = 30 > 20;
        boolean isTrintaMenorVinte = 30 < 20;
        boolean isTrintaIgualVinte = 30 == 20;
        boolean isTrintaDiferenteVinte = 30 != 20;
        System.out.println(isTrintaMaiorVinte);
        System.out.println(isTrintaMenorVinte);
        System.out.println(isTrintaIgualVinte);
        System.out.println(isTrintaDiferenteVinte);

        // && (AND) || (OR) !
        int age = 31;
        float salary = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = age > 30 && salary >= 4612;
        boolean isDentroDaleiMenorQueTrinta = age < 30 && salary >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);

        double valorTotalContaCorrente = 400;
        double valorTotalContaPoupanca = 6000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCintoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println( "isPlaystationCintoCompravel " + isPlaystationCintoCompravel);

         //Operadores de Atribuição += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador +=1;
        contador ++;
        contador --;
        ++contador;
        --contador;
        System.out.println(contador);


    }

}
