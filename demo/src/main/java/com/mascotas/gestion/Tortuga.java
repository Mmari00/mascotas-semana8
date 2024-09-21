package com.mascotas.gestion;

public class Tortuga extends Mascota{

    public Tortuga(String nombre, String especie, String raza, int edad, int tamaño, String color, String estadoDeSalud, String animal) {
        super(nombre, especie, raza, edad, tamaño, color, estadoDeSalud, animal);
    }
    @Override
    public void hacerSonido(){
        System.out.println("Sonido relativo.");
    }

    @Override 
    public void alimentar(){
        System.out.println("Alimentación: 1)Vegetales, 2)Frutas.");
    }

    @Override
    public void cuidar(){
        System.out.println("Cuidados: hacerle su terrario, dejarlas tomar un poco de sol.");
    }

    
}
