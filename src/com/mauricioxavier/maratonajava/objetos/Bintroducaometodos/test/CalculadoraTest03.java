package com.mauricioxavier.maratonajava.objetos.Bintroducaometodos.test;

import com.mauricioxavier.maratonajava.objetos.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20,2));
        System.out.println(calculadora.divideDoisNumeros03(12,2));
        calculadora.metodoDivisaoDoisNumeros(50,0);
        System.out.println("--------------------");
        calculadora.metodoDivisaoDoisNumeros01(20,0);
    }
}
