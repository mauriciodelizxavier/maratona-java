package com.mauricioxavier.maratonajava.introducao.Class07;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte,short,double,float,long, int = 0
        // char return :'\u0000' ''
        // booleans returne: false
        //String return :null

        String [] nomes = new String [5]; //O tamanho do Array não muda dinamicamente
        nomes [0] = "Mauricio";
        nomes [1] = "Antônia";
        nomes [2] = "Maria";
        nomes [3] = "Mateus";
        nomes [4] = "Jorge";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }
        }
    }

