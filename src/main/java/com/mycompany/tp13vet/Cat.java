package com.mycompany.tp13vet;

public class Cat extends Animal {

    public Cat(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla: Miau miau!");
    }

    @Override
    public void accion() {
        System.out.println("Araña el sillón.");
    }
}
