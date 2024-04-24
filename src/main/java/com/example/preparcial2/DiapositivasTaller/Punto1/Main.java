package com.example.preparcial2.DiapositivasTaller.Punto1;

//OJO PENDIENTE
public class Main {
    public static boolean esPalindromo(String cadena) {
        // Eliminamos los espacios en blanco y convertimos la cadena a minúsculas
        cadena = cadena.replaceAll("\\s", "").toLowerCase();

        // Creamos una pila para almacenar los caracteres de la cadena
        Pila<Character> pila = new Pila<>();

        // Agregamos cada carácter de la cadena a la pila
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            pila.push(caracter);
        }

        // Creamos una nueva cadena que contenga los caracteres desapilados de la pila
        StringBuilder cadenaInvertida = new StringBuilder();
        while (!pila.estaVacia()) {
            cadenaInvertida.append(pila.pop());
        }

        // Comparamos la cadena original con la cadena invertida
        String cadenaOriginal = cadena;
        String cadenaInvertidaStr = cadenaInvertida.toString();
        boolean esPalindromo = cadenaOriginal.equals(cadenaInvertidaStr);

        // Mostramos los detalles de la verificación
        System.out.println("Cadena original: " + cadenaOriginal);
        System.out.println("Cadena invertida: " + cadenaInvertidaStr);
        System.out.println("Es un palíndromo: " + esPalindromo);

        return esPalindromo;
    }

    public static void main(String[] args) {
        String cadena1 = "anita lava la tina";
        String cadena2 = "oso";
        String cadena3 = "java";

        System.out.println("¿La cadena \"" + cadena1 + "\" es un palíndromo?: " + esPalindromo(cadena1));
        System.out.println("¿La cadena \"" + cadena2 + "\" es un palíndromo?: " + esPalindromo(cadena2));
        System.out.println("¿La cadena \"" + cadena3 + "\" es un palíndromo?: " + esPalindromo(cadena3));
    }
}

