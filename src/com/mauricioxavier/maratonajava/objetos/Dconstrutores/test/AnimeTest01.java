package com.mauricioxavier.maratonajava.objetos.Dconstrutores.test;

import com.mauricioxavier.maratonajava.objetos.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 15, "Ação", "Production IG");
//        Anime anime2 = new Anime();
        anime.imprimir();
//        anime2.imprimir();

    }
}
