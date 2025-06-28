package com.mauricioxavier.maratonajava.introducao.Aula06;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000000; i ++) {
            if (i % 2 == 0){ // significa que o numero é par
                System.out.println(i);
            }
        }
    }
}
