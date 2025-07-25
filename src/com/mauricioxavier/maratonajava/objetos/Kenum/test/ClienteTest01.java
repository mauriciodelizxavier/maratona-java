package com.mauricioxavier.maratonajava.objetos.Kenum.test;

import com.mauricioxavier.maratonajava.objetos.Kenum.dominio.Cliente;
import com.mauricioxavier.maratonajava.objetos.Kenum.dominio.TipoCliente;
import com.mauricioxavier.maratonajava.objetos.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDIDO);
        Cliente cliente4 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente4);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDIDO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorValor(2);
        TipoCliente tipoCliente3 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente);
        System.out.println(tipoCliente2);
        System.out.println(tipoCliente3);
    }
}
