package com.example.preparcial2.DiapositivasTaller.Punto1;

import com.example.preparcial2.DiapositivasTaller.Cola;
import com.example.preparcial2.DiapositivasTaller.Pila;

public class Main {
    public static void main(String[] args) {
        String palabra = "anitalavalatina";

        if (esPalindromo(palabra)) {
            System.out.println("La palabra '" + palabra + "' es un palíndromo.");
        } else {
            System.out.println("La palabra '" + palabra + "' no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String palabra) {
        Cola<Character> cola = new Cola<>();
        Pila<Character> pila = new Pila<>();

        // Agregar cada carácter de la palabra a la cola y a la pila
        for (int i = 0; i < palabra.length(); i++) {
            cola.encolar(palabra.charAt(i));
            pila.push(palabra.charAt(i));
        }

        // Comparar cada carácter de la cola con el de la pila
        while (!cola.estaVacia()) {
            if (!cola.desencolar().equals(pila.pop())) {
                return false;
            }
        }

        return true;
    }
}


