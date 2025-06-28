package com.mauricioxavier.maratonajava.objetos.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void Imprime(Estudante estudante) {
        System.out.println("------------------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        estudante.nome = "Dejanira";
        /*
         Quando alteramos algo dentro do objeto, estamos mantendo essa alteração com as
         referências que ainda tem ligação com o objeto
        */
    }
}
