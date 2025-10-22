package com.mycompany.tp13vet;

import java.util.ArrayList;

public class Tp13vet {
    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList<>();

        
        Dog d = new Dog("Max", 5);
        Cat c = new Cat("Luna", 3);
        Bird b = new Bird("Piolín", 1);
        Fish f = new Fish("Nemo", 2);

        
        animales.add(d);
        animales.add(c);
        animales.add(b);
        animales.add(f);

       
        System.out.println("Veterinaria 'Animalia'");
        System.out.println("---------------");

        for (Animal a : animales) {
            a.mostrarInfo();
            a.hacerSonido();
            a.accion(); 
            System.out.println();
        }
    }
}

