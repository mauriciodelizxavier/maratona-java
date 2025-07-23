package com.mauricioxavier.maratonajava.objetos.Gassociacao.test;

import com.mauricioxavier.maratonajava.objetos.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Suarez");
        Jogador jogador3 = new Jogador("Neymar");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
