package com.mauricioxavier.maratonajava.introducao.Aula06;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        double valorTotalCarro = 30000;
        for (int parcela = 1; parcela <= valorTotalCarro; parcela++) {
            double valorParcela = valorTotalCarro / parcela;
            if (valorParcela >= 1000) {
                System.out.println(parcela + " parcelas de R$" + valorParcela);
            } else {
                break;
            }


        }
    }
}
