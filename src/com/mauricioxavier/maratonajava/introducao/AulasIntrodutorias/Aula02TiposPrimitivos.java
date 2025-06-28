package com.mauricioxavier.maratonajava.introducao.AulasIntrodutorias;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // boolean, byte, short, int, long, float, double, char

        boolean verdadeiro = true; // guardam verdadeiro ou falso
        boolean falso = false;
        byte idadeByte = 127; // guardam numeros inteiros entre -128 até 127
        short idadeShort = 10; // guardam numeros inteiros entre -32,768 até 32,767
        int idade = 40; // guardam numeros inteiros entre -2,147,483,648 até 2,147,483,647
        long numeroGrande = 1500000000000000L;
        float salarioFloat = 22.5F; // guardam numeros fracionados, capaz de guardar de 6 a 7 dígitos decimais
        double salarioDouble = 258.85; // guardam numeros fracionados de até 15 digitos decimais
        char caractere = 'M'; // guardam apenas um unico caracter ou um valor da tabela ASCII
        char caractere1 = 65;
        String nome = "Mauricio"; // Guardam Strings, não é um tipo primitivo e sim de referência


        System.out.println("Oi, meu nome é "+ nome);
        System.out.println("A idade dele é " + idade + " anos.");
        System.out.println(verdadeiro);
    }
}
