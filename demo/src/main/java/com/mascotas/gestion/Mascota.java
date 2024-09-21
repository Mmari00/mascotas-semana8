package com.mascotas.gestion;

public abstract class Mascota {

    //Atributos
    private String animal;
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private int tamaño;
    private String color;
    private String estadoDeSalud;



    //Constructor
    public Mascota(String nombre, String especie, String raza, int edad, int tamaño, String color,
    String estadoDeSalud, String animal) {
    this.nombre = nombre;
    this.especie = especie;
    this.raza = raza;
    this.edad = edad;
    this.tamaño = tamaño;
    this.color = color;
    this.estadoDeSalud = estadoDeSalud;
    this.animal = animal;
    }

    //Métodos get 
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public int getTamaño() {
        return tamaño;
    }

    public String getColor() {
        return color;
    }

    public String getEstadoDeSalud() {
        return estadoDeSalud;
    }

    public String getAnimal() {
        return animal;
    }
    

    //Métodos abstractos
    public abstract void hacerSonido();
    public abstract void alimentar();
    public abstract void cuidar();

    //Método concreto 
    public void mostrarInformacion(){
        System.out.println("Animal: " + animal);
        System.out.println("Nombre de la mascota: " + nombre);
        System.out.println("Especie de  " + nombre + " : " + especie);
        System.out.println("Raza de  " + nombre + " : " + raza);
        System.out.println("Edad de  " + nombre + " : " + edad);
        System.out.println("Tamaño de  " + nombre + " : " + tamaño);
        System.out.println("Color de  " + nombre + " : " + color);
        System.out.println("Estado de salud de  " + nombre + " : " + estadoDeSalud);
    }

    
}
