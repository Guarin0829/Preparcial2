package com.example.preparcial2.Punto6;

public class Main {
    public static void main(String[] args) {
        // Creamos una nueva cola utilizando dos pilas
        Cola2Pilas<Integer> cola = new Cola2Pilas<>();

        // Agregamos elementos a la cola
        cola.enqueue(1);
        cola.enqueue(2);
        cola.enqueue(3);

        // Imprimimos la cola
        System.out.println("Contenido de la cola:");
        imprimirCola(cola);

        // Eliminamos un elemento de la cola
        int elementoEliminado = cola.dequeue();
        System.out.println("\nElemento eliminado de la cola: " + elementoEliminado);

        // Imprimimos la cola después de eliminar un elemento
        System.out.println("\nContenido de la cola después de eliminar un elemento:");
        imprimirCola(cola);
    }

    // Método auxiliar para imprimir una cola
    public static void imprimirCola(Cola2Pilas<Integer> cola) {
        // Creamos una copia temporal de la cola para no alterar su estado
        Cola2Pilas<Integer> colaTemp = new Cola2Pilas<>();

        // Mientras la cola no esté vacía, imprimimos y eliminamos elementos
        while (!cola.estaVacia()) {
            int elemento = cola.dequeue();
            System.out.print(elemento + " ");
            colaTemp.enqueue(elemento); // Reencolamos el elemento en la cola temporal
        }

        // Restauramos la cola original
        while (!colaTemp.estaVacia()) {
            cola.enqueue(colaTemp.dequeue());
        }
    }
}

