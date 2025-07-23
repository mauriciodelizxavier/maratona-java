package com.mauricioxavier.maratonajava.objetos.Gassociacao.test;

import com.mauricioxavier.maratonajava.objetos.Gassociacao.dominio.Aluno;
import com.mauricioxavier.maratonajava.objetos.Gassociacao.dominio.Local;
import com.mauricioxavier.maratonajava.objetos.Gassociacao.dominio.Professor;
import com.mauricioxavier.maratonajava.objetos.Gassociacao.dominio.Seminario;

public class ExercicioAssociacao {
    public static void main(String[] args) {
        Local local = new Local("Avenida Unisinos");
        Aluno aluno1 = new Aluno("Mauricio", 19);
        Professor professor = new Professor("João", "Professor de Logica");

        Aluno[] alunos = {};

        Seminario seminario = new Seminario("Palestra Tech", alunos, local);
        Seminario seminario2 = new Seminario("Palestra sobre Saúde Mental", alunos, local);

        Seminario[] seminariosDisponiveis = {seminario, seminario2};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
