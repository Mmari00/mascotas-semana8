package com.mascotas.gestion;

public class Gato extends Mascota{

    public Gato(String nombre, String especie, String raza, int edad, int tamaño, String color, String estadoDeSalud, String animal) {
        super(nombre, especie, raza, edad, tamaño, color, estadoDeSalud, animal);
    }
    @Override
    public void hacerSonido(){
        System.out.println("Maullar: Miau! Miau!");
    }

    @Override
    public void alimentar(){
        System.out.println("Alimentación: 1)Pescado, 2)Pavo, 3)Pollo, 4)Croquetas.");

    }

    @Override
    public void cuidar(){
        System.out.println("Cuidados: Abrigarlo mucho, cambiar constantemente su arena, jugar activamente con el.");
    }

}
