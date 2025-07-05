package com.mauricioxavier.maratonajava.objetos.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() { // Void = sem retorno/retorno vazio
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(25 - 10);
    }

    public void multiplicaDoisNumeros(int num, int num2) {
        System.out.println(num * num2);

    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public double divideDoisNumeros03(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void metodoDivisaoDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por 0");
        } else {
            System.out.println(num1 / num2);
        }

    }

    public void metodoDivisaoDoisNumeros01(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por 0");
            return;
        }
        System.out.println(num1 / num2);
    }


    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1:" + numero1);
        System.out.println("Num2: " + numero2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int...numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}

