package com.example.preparcial2.Punto4;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int numero = 7; // Cambia este número por el que desees
        imprimirRepresentacionBinaria(numero);
    }

    public static int imprimirRepresentacionBinaria(int numero) {
        if (numero <= 0) {
            System.out.println("El número debe ser positivo.");
            return 0;
        }

        Stack<Integer> pila = new Stack<>();

        while (numero > 0) {
            int bit = numero % 2;
            pila.push(bit);
            numero /= 2;
        }

        System.out.print("La representación binaria es: ");
        while (!pila.isEmpty()) {
            System.out.print(pila.pop());
        }
        System.out.println();

        return 0; // No hay un valor de retorno significativo en este caso
    }


}
