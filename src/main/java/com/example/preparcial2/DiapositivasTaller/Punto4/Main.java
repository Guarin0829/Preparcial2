package com.example.preparcial2.DiapositivasTaller.Punto4;

import com.example.preparcial2.DiapositivasTaller.Cola;
import com.example.preparcial2.DiapositivasTaller.Pila;

public class Main {

    public static void main(String[] args) {
        Pila<Integer> pilaOriginal = new Pila<>();
        pilaOriginal.push(1);
        pilaOriginal.push(2);
        pilaOriginal.push(3);
        pilaOriginal.push(4);
        pilaOriginal.push(5);

        Cola<Integer> colaPares = new Cola<>();
        ponerParesEnCola(pilaOriginal, colaPares);

        System.out.println("Elementos pares en la cola:");
        colaPares.imprimir();
    }

    public static void ponerParesEnCola(Pila<Integer> pilaOriginal, Cola<Integer> colaPares) {
        Pila<Integer> pilaTemporal = new Pila<>();

        while (!pilaOriginal.estaVacia()) {
            int elemento = pilaOriginal.pop();
            if (elemento % 2 == 0) {
                colaPares.encolar(elemento); // Encolar elemento par
            } else {
                pilaTemporal.push(elemento); // Apilar elemento impar temporalmente
            }
        }

        // Vaciar la pila temporal de vuelta a la pila original
        while (!pilaTemporal.estaVacia()) {
            pilaOriginal.push(pilaTemporal.pop());
        }
    }

}
