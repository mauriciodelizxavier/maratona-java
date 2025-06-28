package com.mauricioxavier.maratonajava.introducao.AulasIntrodutorias;

public class Aula4Operadores {
    public static void main(String[] args) {
        // + - * /
        int numero1 = 10;
        int numero2 = 20;
        int resultadoMultiplicacao = numero1 * numero2;
        double resultadoDivisao = (double) numero1 / numero2;
        System.out.println(resultadoDivisao);
        System.out.println(resultadoMultiplicacao);

        // %
        int resto = numero1 % numero2;
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

        // && (AND) || (OR) ! (não)
        int age = 31;
        float salary = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = age > 30 && salary >= 4612;
        boolean isDentroDaleiMenorQueTrinta = age < 30 && salary >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);

        double valorTotalContaCorrente = 400;
        double valorTotalContaPoupanca = 6000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        //Operadores de Atribuição += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // isso é a mesma coisa que bonus = bonus + 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2; // bonus = bonus % 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(contador);
        System.out.println(++contador2);


    }

}
