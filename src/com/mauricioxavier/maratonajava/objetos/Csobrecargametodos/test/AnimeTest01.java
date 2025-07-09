package com.mauricioxavier.maratonajava.objetos.Csobrecargametodos.test;

import com.mauricioxavier.maratonajava.objetos.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Murylo", "TV", 15, "Ação");
        anime.imprimir();

    }
}
