package com.mauricioxavier.maratonajava.objetos.Minterfaces.test;

import com.mauricioxavier.maratonajava.objetos.Minterfaces.dominio.DataLoader;
import com.mauricioxavier.maratonajava.objetos.Minterfaces.dominio.DatabaseLoader;
import com.mauricioxavier.maratonajava.objetos.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
    }
}
