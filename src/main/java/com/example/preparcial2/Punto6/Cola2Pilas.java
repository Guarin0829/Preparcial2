package com.example.preparcial2.Punto6;

public class Cola2Pilas<T> {
    private Pila<T> pilaEntrada; // Utilizada para la operación enqueue
    private Pila<T> pilaSalida; // Utilizada para la operación dequeue

    public Cola2Pilas() {
        pilaEntrada = new Pila<>();
        pilaSalida = new Pila<>();
    }

    // Método para agregar un elemento a la cola (enqueue)
    public void enqueue(T elemento) {
        pilaEntrada.push(elemento);
    }

    // Método para eliminar y devolver el primer elemento de la cola (dequeue)
    public T dequeue() {
        if (pilaSalida.estaVacia()) {
            // Si la pila de salida está vacía, transferimos todos los elementos de la pila de entrada a la pila de salida
            transferirPilaEntradaAPilaSalida();
        }
        // Realizamos la operación de dequeue en la pila de salida
        return pilaSalida.pop();
    }

    // Método auxiliar para transferir todos los elementos de la pila de entrada a la pila de salida
    private void transferirPilaEntradaAPilaSalida() {
        while (!pilaEntrada.estaVacia()) {
            pilaSalida.push(pilaEntrada.pop());
        }
    }

    // Método para verificar si la cola está vacía
    public boolean estaVacia() {
        return pilaEntrada.estaVacia() && pilaSalida.estaVacia();
    }
}
