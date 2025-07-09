package com.mauricioxavier.maratonajava.objetos.Eblocosinicializacao.test;


import com.mauricioxavier.maratonajava.objetos.Eblocosinicializacao.dominio.Quadrinho;

public class QuadrinhoTest01 {
    public static void main(String[] args) {
        Quadrinho quadrinho = new Quadrinho("One Piece");
        for (int episodio : quadrinho.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
