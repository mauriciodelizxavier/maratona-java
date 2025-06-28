package com.mauricioxavier.maratonajava.introducao.Class07;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int [3];
        numeros [0] = 3;
        numeros [1] = 6;
        numeros [2] = 9;
        int [] numeros2 = {1,2,3,4,5};
        int [] numeros3 = new int[]{1,2,3,4,5,};

        for (int i = 0; i <numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }
        for(int num:numeros){
            System.out.println(num);
        }
        int num = numeros3[0];
        System.out.println(num);
        num = numeros3 [1];
        System.out.println(num);
        num = numeros3 [2];
        System.out.println(num);
        num = numeros3 [3];
        System.out.println(num);
    }
}
