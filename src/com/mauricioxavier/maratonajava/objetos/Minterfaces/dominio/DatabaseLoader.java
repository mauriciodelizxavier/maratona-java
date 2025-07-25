package com.mauricioxavier.maratonajava.objetos.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader {
    @Override
    public void load() {
        System.out.println("Carregando dados do BD");
    }
}
