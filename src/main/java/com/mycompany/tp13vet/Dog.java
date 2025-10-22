package com.mycompany.tp13vet;

public class Dog extends Animal {

    public Dog(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }

    @Override
    public void accion() {
        System.out.println("Corre felizmente.");
    }
}

