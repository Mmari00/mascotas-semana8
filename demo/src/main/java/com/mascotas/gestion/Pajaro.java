package com.mascotas.gestion;

public class Pajaro extends Mascota{

    public Pajaro(String nombre, String especie, String raza, int edad, int tamaño, String color, String estadoDeSalud, String animal) {
        super(nombre, especie, raza, edad, tamaño, color, estadoDeSalud, animal);
    }
    @Override
    public void hacerSonido(){
        System.out.println("Canto: Pío! Pío!");
    }

    @Override
    public void alimentar(){
        System.out.println("Alimentación: 1)Semillas, 2)Agua.");

    }

    @Override
    public void cuidar(){
        System.out.println("Cuidados: Limpiar su jaula, ponerle comederos y bebederos, también perchas con texturas.");
    }


    
}