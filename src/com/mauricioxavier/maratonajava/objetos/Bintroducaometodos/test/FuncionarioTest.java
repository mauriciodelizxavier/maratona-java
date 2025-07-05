package com.mauricioxavier.maratonajava.objetos.Bintroducaometodos.test;

import com.mauricioxavier.maratonajava.objetos.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Marcio");
        funcionario.setIdade(45);
        funcionario.setSalarios(new double[]{4500, 4785.58, 4796.57});
        funcionario.imprime();

        System.out.println("Média: " + funcionario.getMedia());


    }
}
