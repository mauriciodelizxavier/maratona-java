package com.mauricioxavier.maratonajava.objetos.Aintroducaoclasses.test;

import com.mauricioxavier.maratonajava.objetos.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Mauricio";
        estudante.idade = 18;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
