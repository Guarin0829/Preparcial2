package com.example.preparcial2.DiapositivasTaller.Punto5;

import com.example.preparcial2.DiapositivasTaller.Pila;

public class Main {
    public static void main(String[] args) {
        Pila<Integer> pila = new Pila<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        eliminarElemento(pila, 3); // Eliminar el elemento 3 de la pila

        System.out.println("Pila después de eliminar el elemento 3:");
        pila.imprimir();
    }

    public static void eliminarElemento(Pila<Integer> pila, int valor) {
        Pila<Integer> pilaTemporal = new Pila<>();

        // Buscar y eliminar el elemento de la pila original
        while (!pila.estaVacia()) {
            int elemento = pila.pop();
            if (elemento != valor) {
                pilaTemporal.push(elemento); // Almacenar temporalmente los elementos diferentes al valor deseado
            }
        }

        // Restaurar la pila original con los elementos restantes
        while (!pilaTemporal.estaVacia()) {
            pila.push(pilaTemporal.pop());
        }
    }

}
