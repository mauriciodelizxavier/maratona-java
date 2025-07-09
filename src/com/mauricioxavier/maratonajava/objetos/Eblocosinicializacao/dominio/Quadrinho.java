package com.mauricioxavier.maratonajava.objetos.Eblocosinicializacao.dominio;

public class Quadrinho {
    private String nome;
    private int[] episodios;
    // 1 - Alocado espaço em memória para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores "default" ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - O construtor é executado

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[10];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Quadrinho(String nome) {
        this.nome = nome;
    }

    public Quadrinho() {
        for (int episodio : this.episodios) {
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
