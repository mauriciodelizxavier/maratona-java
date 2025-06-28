package com.mauricioxavier.maratonajava.introducao.Class07;

public class ArraysLoianeGroner01 {
    public static void main(String[] args) {
        double[] temperaturasDiasAno = new double[365];
        temperaturasDiasAno [0] = 32.5;
        temperaturasDiasAno [1] = 31.8;
        System.out.println("Temperatura do dia 2 é; " + temperaturasDiasAno[1]);
        System.out.println("O tamanho do Array: " + temperaturasDiasAno.length);
        for (int i = 0; i < temperaturasDiasAno.length ; i++) {
            System.out.println("A temperatura do dia " + (i+1) + " é: " + temperaturasDiasAno [i]);
        }
        for (double temp : temperaturasDiasAno){
            System.out.println(temp);
        }
    }

}

