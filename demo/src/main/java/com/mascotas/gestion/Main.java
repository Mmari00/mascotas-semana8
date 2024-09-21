package com.mascotas.gestion;

public class Main {
   public static void main(String[] args) {
        System.out.println();
        
        Perro perro = new Perro("Lucas", "--", "Golden", 5 , 60, "Naranja claro", "Regular", "Perro");
        perro.mostrarInformacion();
        perro.hacerSonido();
        perro.alimentar();
        perro.cuidar();

        System.out.println();

        Gato gato = new Gato("Carla", "--", "Siamés", 2, 25, "Blanco y negro", "Medio critico", "Gato");
        gato.mostrarInformacion();
        gato.hacerSonido();
        gato.alimentar();
        gato.cuidar();
        
        System.out.println();

        Pajaro pajaro = new Pajaro("Roberto", "Periquito", "--", 1, 12, "Rojo", "Estable", "Pajaro");
        pajaro.mostrarInformacion();
        pajaro.hacerSonido();
        pajaro.alimentar();
        pajaro.cuidar();

        System.out.println();

        Tortuga tortuga = new Tortuga("Amatista", "Verde del pacífico", "--", 4, 17, "Verde/café", "Estable", "Tortuga");
        tortuga.mostrarInformacion();
        tortuga.hacerSonido();
        tortuga.alimentar();
        tortuga.cuidar();

        System.out.println();

    }
}