package com.mauricioxavier.maratonajava.objetos.Minterfaces.dominio;

public interface DataLoader {
    void load(); // Os metodos em ‘Interface’ são por padrão públicos e abstratos. Então seria redundante escrever dnv.

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões.");
    }
}
