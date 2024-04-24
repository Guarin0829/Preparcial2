package com.example.preparcial2.Punto1;

public class ListaInvertida {

    public static void main(String[] args) {
        ListaSimple<Integer> listaNumeros = new ListaSimple<>();
        listaNumeros.agregarInicio(5);
        listaNumeros.agregarInicio(2);
        listaNumeros.agregarInicio(3);
        System.out.println("Lista original:");
        listaNumeros.imprimirLista();

        // Invertir la lista utilizando el método invertirConPilas()
        ListaSimple<Integer> listaInvertida = listaNumeros.invertirConPilas();

        // Imprimir la lista invertida
        System.out.println("Lista invertida:");
        listaInvertida.imprimirLista();
    }


}

