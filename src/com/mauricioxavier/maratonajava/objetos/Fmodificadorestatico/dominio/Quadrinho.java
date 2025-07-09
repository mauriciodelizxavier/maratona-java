package com.mauricioxavier.maratonajava.objetos.Fmodificadorestatico.dominio;

public class Quadrinho {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização é executado quando a JVM carregar a classe
    // 1 - Alocado espaço em memória para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores "default" ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - O construtor é executado

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[1];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Quadrinho(String nome) {
        this.nome = nome;
    }

    public Quadrinho() {
        for (int episodio : Quadrinho.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
