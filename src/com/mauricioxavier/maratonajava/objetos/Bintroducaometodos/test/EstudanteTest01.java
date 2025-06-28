package com.mauricioxavier.maratonajava.objetos.Bintroducaometodos.test;

import com.mauricioxavier.maratonajava.objetos.Bintroducaometodos.dominio.Estudante;
import com.mauricioxavier.maratonajava.objetos.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Antonia";
        estudante01.sexo = 'F';
        estudante01.idade = 20;

        estudante02.nome = "Mauricio";
        estudante02.sexo = 'M';
        estudante02.idade = 19;

        impressora.Imprime(estudante01);

        impressora.Imprime(estudante02);

        System.out.println("######################");

        impressora.Imprime(estudante01);

        impressora.Imprime(estudante02);


    }
}
