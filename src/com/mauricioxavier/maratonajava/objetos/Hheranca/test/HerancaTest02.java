package com.mauricioxavier.maratonajava.objetos.Hheranca.test;

import com.mauricioxavier.maratonajava.objetos.Hheranca.dominio.Endereco;
import com.mauricioxavier.maratonajava.objetos.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicialização static da superclasse é executado quando a JVM carregar a superclasse
    // 1 - Bloco de inicialização static da subclasse é executado quando a JVM carregar a subclasse
    // 2 - Alocado espaço em memória para o objeto da superclasse
    // 3 - Cada atributo de superclasse é criado e inicializado com valores "default" ou o que for passado
    // 4 - Bloco de inicialização da superclasse é executado na ordem que aparece.
    // 5 - O construtor da superclasse é executado
    // 6 - Alocado espaço em memória para o objeto da subclasse
    // 7 - Cada atributo de subclasse é criado e inicializado com valores "default" ou o que for passado
    // 8 - Bloco de inicialização da subclasse é executado na ordem que aparece.
    // 9 - O construtor da subclasse é executado

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Mauricio");
    }
}
