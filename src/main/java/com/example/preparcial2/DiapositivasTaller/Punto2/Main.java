package com.example.preparcial2.DiapositivasTaller.Punto2;

import com.example.preparcial2.DiapositivasTaller.ListaSimple;
import com.example.preparcial2.DiapositivasTaller.Pila;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Generar una secuencia aleatoria de 10 números
        ListaSimple<Integer> lista = generarSecuenciaAleatoria(10);

        // Imprimir la secuencia original
        System.out.println("Secuencia original:");
        lista.imprimirLista();

        // Poner los elementos de la lista en una pila
        Pila<Integer> pila = new Pila<>();
        for (Integer numero : lista) {
            pila.push(numero);
        }

        // Imprimir la pila extrayendo los elementos
        System.out.println("\nPila:");
        while (!pila.estaVacia()) {
            System.out.print(pila.pop() + "\t");
        }
    }

    // Método para generar una secuencia aleatoria de números y almacenarlos en una lista
    private static ListaSimple<Integer> generarSecuenciaAleatoria(int longitud) {
        ListaSimple<Integer> lista = new ListaSimple<>();
        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            lista.agregarfinal(random.nextInt(100)); // Genera números aleatorios entre 0 y 99
        }
        return lista;
    }

}
