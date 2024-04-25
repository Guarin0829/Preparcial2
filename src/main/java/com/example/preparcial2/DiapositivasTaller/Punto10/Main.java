package com.example.preparcial2.DiapositivasTaller.Punto10;

import com.example.preparcial2.DiapositivasTaller.Cola;

public class Main {

    public static void main(String[] args) {
        // Crear dos colas de personas
        Cola<Object> cola1 = new Cola<>();
        Cola<Object> cola2 = new Cola<>();

        // Llenar las colas con algunas personas
        cola1.encolar(2);
        cola1.encolar('q');
        cola1.encolar(4);

        cola2.encolar(2);
        cola2.encolar('q');
        cola2.encolar(4);

        // Comparar las colas
        if (compararColas(cola1, cola2)) {
            System.out.println("Las colas son idénticas.");
        } else {
            System.out.println("Las colas no son idénticas.");
        }
    }

    public static <T> boolean compararColas(Cola<T> cola1, Cola<T> cola2) {
        // Clonar ambas colas para no modificar las originales
        Cola<T> clon1 = cola1.clone();
        Cola<T> clon2 = cola2.clone();

        // Verificar si ambas colas tienen el mismo tamaño
        if (clon1.getTamano() != clon2.getTamano()) {
            return false;
        }

        // Comparar elemento por elemento
        while (!clon1.estaVacia()) {
            if (!clon1.desencolar().equals(clon2.desencolar())) {
                return false;
            }
        }

        // Si no se encontraron diferencias, las colas son idénticas
        return true;
    }

}
