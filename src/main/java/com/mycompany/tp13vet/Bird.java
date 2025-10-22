package com.mycompany.tp13vet;

public class Bird extends Animal {

    public Bird(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pájaro canta: Pío pío!");
    }

    @Override
    public void accion() {
        System.out.println("Vuela sobre la jaula.");
    }
}
