package com.example.preparcial2.DiapositivasTaller.Punto9;

import com.example.preparcial2.DiapositivasTaller.Cola;

public class Main {

    public static void main(String[] args) {
        Cola<Object> cola = new Cola<>();

        // Añadir caracteres a la cola
        cola.encolar('a');
        cola.encolar(3);
        cola.encolar("Jesus");

        // Imprimir la cola
        System.out.println("Cola de caracteres:");
        cola.imprimir();

    }
}
