package com.mauricioxavier.maratonajava.introducao.Aula05;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 16;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida != false) {
            System.out.println("Pode comprar");
        } else {
            System.out.println("Não está autorizado");

            if (isAutorizadoComprarBebida == false) { // é o mesmo que por !isAutorizadoComprarBebida
                System.out.println("Não está autorizado");
            }
        }
    }
}
