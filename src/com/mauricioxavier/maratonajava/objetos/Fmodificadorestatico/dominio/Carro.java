package com.mauricioxavier.maratonajava.objetos.Fmodificadorestatico.dominio;

public class Carro {
    private String marca;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String marca, double velocidadeMaxima) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime (){
        System.out.println("-------------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Velocidade Maxima " + this.velocidadeMaxima);
        System.out.println("Valocidade Limite " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite; // métodos estáticos não podem acessar atributos de instância.
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
