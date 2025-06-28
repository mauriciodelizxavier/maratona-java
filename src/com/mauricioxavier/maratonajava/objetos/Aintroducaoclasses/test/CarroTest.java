package com.mauricioxavier.maratonajava.objetos.Aintroducaoclasses.test;

import com.mauricioxavier.maratonajava.objetos.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Gol";
        carro1.modelo = "G5";
        carro1.ano = 2025;

        carro2.nome = "Meriva";
        carro2.modelo = "Maxi";
        carro2.ano = 2009;

        carro1 = carro2; // Referência do carro1 agora aponta para o mesmo objeto que carro2.

        System.out.println("Nome: " + carro1.nome);
        System.out.println("Modelo: " + carro1.modelo);
        System.out.println("\nAno: " + carro1.ano);

        System.out.println("Nome: " + carro2.nome);
        System.out.println("Modelo: " + carro2.modelo);
        System.out.println("Ano: " + carro2.ano);
    }
}
