package com.mauricioxavier.maratonajava.objetos.Fmodificadorestatico.test;

import com.mauricioxavier.maratonajava.objetos.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(195);
        c3.setVelocidadeMaxima(250);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
