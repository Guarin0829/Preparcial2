package com.example.preparcial2.DiapositivasTaller.Punto3y7;

import com.example.preparcial2.DiapositivasTaller.Pila;

public class Main {
    public static void main(String[] args) {
        // Creamos dos pilas de ejemplo
        Pila<Integer> pila1 = new Pila<>();
        pila1.push(1);
        pila1.push(2);
        pila1.push(3);

        Pila<Integer> pila2 = new Pila<>();
        pila2.push(4);
        pila2.push(5);
        pila2.push(6);

        // Concatenamos las dos pilas
        Pila<Integer> pilaConcatenada = concatenarPilas(pila1, pila2);

        // Imprimimos la pila concatenada
        System.out.println("Pila concatenada:");
        pilaConcatenada.imprimir();
    }

    public static <T> Pila<T> concatenarPilas(Pila<T> pila1, Pila<T> pila2) {
        // Creamos una pila auxiliar para almacenar los elementos de la pila1 en orden inverso
        Pila<T> pilaAuxiliar = new Pila<>();
        while (!pila1.estaVacia()) {
            pilaAuxiliar.push(pila1.pop());
        }

        // Concatenamos los elementos de la pilaAuxiliar (pila1 invertida) en la pila2
        while (!pilaAuxiliar.estaVacia()) {
            pila2.push(pilaAuxiliar.pop());
        }

        // Devolvemos la pila2, que ahora contiene la concatenación de las dos pilas
        return pila2;
    }

}
