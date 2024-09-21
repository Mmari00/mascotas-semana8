package com.mascotas.gestion;

public class Perro extends Mascota{
    public Perro(String nombre, String especie, String raza, int edad, int tamaño, String color, String estadoDeSalud, String animal) {
        super(nombre, especie, raza, edad, tamaño, color, estadoDeSalud, animal);
    }
    

    @Override
    public void hacerSonido(){
        System.out.println("Ladra = Guau! Guau!");
    }

    @Override
    public void alimentar(){
        System.out.println("Alimentación: 1) Mucha agua, 2) Carne, 3)Croquetas");

    }

    @Override
    public void cuidar(){
        System.out.println("Cuidados: Mucho amor, bañarlo cada 3 días, pasear durante mínimo 40 mins, darle su medicina.");
    }

}
