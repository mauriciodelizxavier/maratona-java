package com.mauricioxavier.maratonajava.introducao.Aula06;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 8; // Se colocaros um valor falso aqui, ele não irá executar nada.
        while (count <= 30) {
            System.out.println(count);
            count += 1; // Trocando o estado da variável, pois se não declararmos isso, ele repetirá infinitamente.
        }
        count = 0;
        do {
            System.out.println("Dentro do do-while " + ++count);
        } while (count < 8);

        for (int i = 0; i <= 20; i++) { // variáveis locais precisam ser inicializadas antes de utilizarmos
            System.out.println("For " + i);
        }
    }

}

