package com.mauricioxavier.maratonajava.objetos.Gassociacao.test;

import com.mauricioxavier.maratonajava.objetos.Gassociacao.dominio.Jogador;
import com.mauricioxavier.maratonajava.objetos.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Cafu");
        Time time = new Time("Seleção Brasileira");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("---Time---");
        time.imprime();

        System.out.println("---Jogador---");
        jogador.imprime();
        jogador2.imprime();



    }
}
