package com.mauricioxavier.maratonajava.introducao.Aula05;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia da semana considerando 1 como domingo
        byte dia = 6;
        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Quin");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Dia Inválido.");
                 /*
             Utilizamos o default caso tenha um case inatingível, por exemplo se digitarmos dia = 10, não existe.
             Ele não precisa estar no final do código, mas precisamos ficar atentos na posição dele, caso no inicio,
             precisamos travar ele com o break também.
                 */
        }

        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }


}
