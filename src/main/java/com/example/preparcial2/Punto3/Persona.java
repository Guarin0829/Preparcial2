package com.example.preparcial2.Punto3;

public class Persona {

    String nombre;
    int edad;
    SEXO sexo;


    public Persona() {
    }

    public Persona(String nombre, int edad, SEXO sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public SEXO getSexo() {
        return sexo;
    }

    public void setSexo(SEXO sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
       return getNombre();
   }
}