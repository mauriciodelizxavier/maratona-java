package com.mauricioxavier.maratonajava.objetos.Isobrescrita.test;

import com.mauricioxavier.maratonajava.objetos.Isobrescrita.dominio.Cachorro;

public class CachorroTestToString {
    public static void main(String[] args) {
    Cachorro cachorro = new Cachorro();
    cachorro.nome = "Belinha";
    cachorro.idade = 10;
    System.out.println(cachorro);
    }
}
