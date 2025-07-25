package com.mauricioxavier.maratonajava.objetos.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do BD");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados do BD");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no BD");
    }
}
