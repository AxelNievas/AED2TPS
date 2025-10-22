package com.mycompany.tp13vet;

public class Fish extends Animal {

    public Fish(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pez hace burbujas.");
    }

    @Override
    public void accion() {
        System.out.println("Nada entre las plantas.");
    }
}
