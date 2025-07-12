package com.mauricioxavier.maratonajava.objetos.Gassociacao.test;

import com.mauricioxavier.maratonajava.objetos.Gassociacao.dominio.Jogador;
import com.mauricioxavier.maratonajava.objetos.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
