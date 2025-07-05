package com.mauricioxavier.maratonajava.objetos.Bintroducaometodos.test;

import com.mauricioxavier.maratonajava.objetos.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Marcio";
        funcionario.idade = 45;
        funcionario.salarios = new double[]{4500, 4785.58, 4796.57};
        funcionario.imprimeDados();


    }
}
