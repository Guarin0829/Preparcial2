package com.example.preparcial2.Punto8;

public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();
        Pila pila = new Pila();

        cola.encolar(new Persona("Juan"));
        cola.encolar(new Persona("Pedro"));
        cola.encolar(new Persona("Maria"));


        System.out.println("Contenido de la cola al principio:");
        cola.mostrar();


        desencolarYApilar(cola, pila);


        desapilarYEncolar(pila, cola);


        System.out.println("\nContenido de la cola al final:");
        cola.mostrar();
    }


    public static void desencolarYApilar(Cola cola, Pila pila) {
        System.out.println("\nDesencolando personas de la cola y apilándolas en la pila:");
        while (!cola.estáVacia()) {
            Persona personaDesencolada = cola.desencolar();
            System.out.println("Desencolando: " + personaDesencolada);
            pila.apilar(personaDesencolada);
        }
    }


    public static void desapilarYEncolar(Pila pila, Cola cola) {
        System.out.println("\nDesapilando personas de la pila y encolándolas nuevamente en la cola:");
        while (!pila.estáVacia()) {
            Persona personaDesapilada = pila.desapilar();
            System.out.println("Desapilando: " + personaDesapilada);
            cola.encolar(personaDesapilada);
        }
    }
}

