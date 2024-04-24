package com.example.preparcial2.Punto8;

public class Nodo {
    private Persona dato;
    private Nodo siguiente;

    public Nodo(Persona dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Persona obtenerDato() {
        return dato;
    }

    public void establecerDato(Persona dato) {
        this.dato = dato;
    }

    public Nodo obtenerSiguiente() {
        return siguiente;
    }

    public void establecerSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}


