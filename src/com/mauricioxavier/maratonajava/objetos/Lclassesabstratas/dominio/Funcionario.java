package com.mauricioxavier.maratonajava.objetos.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        CalculaPlr();
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    public abstract void CalculaPlr(); // Aqui eu obrigo todas as subclasses a implementar um mtd que calcula o Plr
}
