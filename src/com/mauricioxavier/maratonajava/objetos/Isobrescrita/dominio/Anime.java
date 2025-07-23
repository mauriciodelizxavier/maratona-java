package com.mauricioxavier.maratonajava.objetos.Isobrescrita.dominio;

public class Anime  {
    private String nome;
    private int episodios;

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                ", episodios=" + episodios +
                '}';
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
