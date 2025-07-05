package com.mauricioxavier.maratonajava.objetos.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
        tirarMediaSalarios();
    }


    public void tirarMediaSalarios() {
        double media = 0;
        for (double salario : salarios) {
            media = +salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial: " + media);
    }
}



