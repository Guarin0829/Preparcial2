package com.example.preparcial2.Punto8;

public class Cola {
    private Nodo frente;
    private Nodo finalCola;

    public Cola() {
        frente = null;
        finalCola = null;
    }

    // Método para agregar una persona al final de la cola
    public void encolar(Persona persona) {
        Nodo nuevoNodo = new Nodo(persona);
        if (estáVacia()) {
            frente = nuevoNodo;
            finalCola = nuevoNodo;
        } else {
            finalCola.establecerSiguiente(nuevoNodo);
            finalCola = nuevoNodo;
        }
    }

    // Método para eliminar y devolver la persona al frente de la cola
    public Persona desencolar() {
        if (estáVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        Persona personaDesencolada = (Persona) frente.obtenerDato();
        frente = frente.obtenerSiguiente();
        if (frente == null) {
            finalCola = null;
        }
        return personaDesencolada;
    }

    // Método para verificar si la cola está vacía
    public boolean estáVacia() {
        return frente == null;
    }

    // Método para obtener la persona al frente de la cola sin eliminarla
    public Persona frente() {
        if (estáVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return (Persona) frente.obtenerDato();
    }

    // Método para mostrar el contenido de la cola
    public void mostrar() {
        if (estáVacia()) {
            System.out.println("La cola está vacía.");
            return;
        }

        Nodo nodoActual = frente;
        while (nodoActual != null) {
            System.out.println(nodoActual.obtenerDato());
            nodoActual = nodoActual.obtenerSiguiente();
        }
    }
}







