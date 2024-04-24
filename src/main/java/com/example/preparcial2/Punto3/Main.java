package com.example.preparcial2.Punto3;

public class Main {

    public static void main(String[] args) {
        Cola cola = new Cola();


        cola.encolar(new Persona("Juana",32, SEXO.FEMENINO));
        cola.encolar(new Persona("Pedro",30, SEXO.MASCULINO));
        cola.encolar(new Persona("Maria",28, SEXO.FEMENINO));
        cola.encolar(new Persona("Juan",25, SEXO.MASCULINO));


        System.out.println("Contenido de la cola al principio:");
        cola.imprimir();

        quitarHombresEntre30y50(cola);
        System.out.println("Cola sin hombres de 30 a 50 años:");
        cola.imprimir();

    }

    public static void quitarHombresEntre30y50(Cola<Persona> cola) {
        Cola<Persona> colaTemp = new Cola<>();

        while (!cola.estaVacia()) {
            Persona persona = cola.desencolar();
            if (persona.getSexo() == SEXO.MASCULINO && persona.getEdad() >= 30 && persona.getEdad() <= 50) {
                // No agregamos a la cola temporal a los hombres entre 30 y 50 años
                continue;
            }
            colaTemp.encolar(persona);
        }

        // Devolvemos los elementos a la cola original
        while (!colaTemp.estaVacia()) {
            cola.encolar(colaTemp.desencolar());
        }
    }
}
