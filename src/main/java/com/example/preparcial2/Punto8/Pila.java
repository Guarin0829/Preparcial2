package com.example.preparcial2.Punto8;

public class Pila {
    private Nodo cima;

    public Pila() {
        cima = null;
    }

    // Método para verificar si la pila está vacía
    public boolean estáVacia() {
        return cima == null;
    }

    // Método para insertar una persona en la cima de la pila
    public void apilar(Persona persona) {
        Nodo nuevoNodo = new Nodo(persona);
        if (estáVacia()) {
            cima = nuevoNodo;
        } else {
            nuevoNodo.establecerSiguiente(cima);
            cima = nuevoNodo;
        }
    }

    // Método para eliminar y devolver la persona en la cima de la pila
    public Persona desapilar() {
        if (estáVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        Persona personaDesapilada = (Persona) cima.obtenerDato();
        cima = cima.obtenerSiguiente();
        return personaDesapilada;
    }

    // Método para obtener la persona en la cima de la pila sin eliminarla
    public Persona cima() {
        if (estáVacia()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return (Persona) cima.obtenerDato();
    }

    public void mostrar() {
        if (estáVacia()) {
            System.out.println("La pila está vacía.");
            return;
        }
    }
}



