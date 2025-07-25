package com.mauricioxavier.maratonajava.objetos.Lclassesabstratas.dominio;

public class Dev extends Funcionario{
    public Dev(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void CalculaPlr() {
        this.salario += this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
