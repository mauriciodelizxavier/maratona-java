package com.mauricioxavier.maratonajava.introducao.Aula06;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotalCarro = 30000;
        for (int parcela = (int) valorTotalCarro; parcela >=1 ; parcela--){
            double  valorParcela = valorTotalCarro / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println(parcela + " parcelas de R$" + valorParcela);
        }
    }
}
