package com.mauricioxavier.maratonajava.objetos.Kenum.dominio;

public enum TipoPagamento { // Pode-se usar diferentes mod. de acesso
    CREDIDO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    }, DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    };

    public abstract double calcularDesconto(double valor);

}