package com.mauricioxavier.maratonajava.objetos.Aintroducaoclasses.test;

import com.mauricioxavier.maratonajava.objetos.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Fabio";
        professor.idade = 45;
        professor.sexo = 'M';
        System.out.println("Nome:" + professor.nome + " Idade:" + professor.idade + " Sexo:" + professor.sexo);
    }

}
