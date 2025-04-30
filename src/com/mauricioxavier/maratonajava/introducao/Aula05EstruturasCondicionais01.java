package com.mauricioxavier.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 19;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Pode comprar");
        } else {
            System.out.println("Não está autorizado");
            if (isAutorizadoComprarBebida == false) { // é o mesmo que por !isAutorizadoComprarBebida
                System.out.println("Não está autorizado");
            }
        }
    }
}
