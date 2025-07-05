package com.mauricioxavier.maratonajava.objetos.Bintroducaometodos.test;

import com.mauricioxavier.maratonajava.objetos.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {10, 30, 40, 50};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,5,7,8,9,10);// muda apenas a sintaxe, é mais facil assim
    }
}
