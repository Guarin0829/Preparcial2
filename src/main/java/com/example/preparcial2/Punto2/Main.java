package com.example.preparcial2.Punto2;

public class Main {

    public static void main(String[] args) {
        // Crear la pila y la cola
        Pila<Integer> pila = new Pila<>();
        Cola<Integer> cola = new Cola<>();

        // Agregar elementos a la pila
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);
        pila.push(6);

        // Imprimir la pila original
        System.out.println("Pila original:");
        pila.imprimir();
        System.out.println();

        // Llamar al método para poner los primos en la cola
        ponerPrimosEnCola(pila, cola);

        // Imprimir la cola resultante
        System.out.println("Elementos primos en la cola:");
        cola.imprimir();
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para poner los números primos de la pila en la cola
    public static void ponerPrimosEnCola(Pila<Integer> pila, Cola<Integer> cola) {
        Pila<Integer> auxiliar = new Pila<>();

        // Mientras la pila no esté vacía
        while (!pila.estaVacia()) {
            int elemento = pila.pop();
            // Si el elemento es primo, lo encolamos en la cola
            if (esPrimo(elemento)) {
                cola.encolar(elemento);
            }
            // Mantenemos el elemento en una pila auxiliar
            auxiliar.push(elemento);
        }

        // Restauramos la pila original
        while (!auxiliar.estaVacia()) {
            pila.push(auxiliar.pop());
        }
    }
}
