package com.mauricioxavier.maratonajava.objetos.Hheranca.test;

import com.mauricioxavier.maratonajava.objetos.Hheranca.dominio.Endereco;
import com.mauricioxavier.maratonajava.objetos.Hheranca.dominio.Funcionario;
import com.mauricioxavier.maratonajava.objetos.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();

        endereco.setRua("Av. Rodolfo Muller 1627");
        endereco.setCep("93056-040");
        Pessoa pessoa = new Pessoa("Mauricio");
        pessoa.setCpf("123.321.356-16");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Tonia");
        funcionario.setCpf("111.222.333.44");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(30000);
        funcionario.imprime();
    }
}
