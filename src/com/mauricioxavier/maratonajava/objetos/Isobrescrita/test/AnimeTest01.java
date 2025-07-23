package com.mauricioxavier.maratonajava.objetos.Isobrescrita.test;

import com.mauricioxavier.maratonajava.objetos.Isobrescrita.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Dragon Ball");
        anime.setEpisodios(12);
        System.out.println(anime);
    }
}
