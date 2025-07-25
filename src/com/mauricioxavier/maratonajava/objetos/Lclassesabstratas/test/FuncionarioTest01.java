package com.mauricioxavier.maratonajava.objetos.Lclassesabstratas.test;

import com.mauricioxavier.maratonajava.objetos.Lclassesabstratas.dominio.Dev;
import com.mauricioxavier.maratonajava.objetos.Lclassesabstratas.dominio.Funcionario;
import com.mauricioxavier.maratonajava.objetos.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Dev desenvolvedor = new Dev("Mauricio", 2500);
        Gerente gerente = new Gerente("Juliano", 15000);
        System.out.println(desenvolvedor);
        System.out.println(gerente);
        gerente.imprime();
        desenvolvedor.imprime();

    }
}
