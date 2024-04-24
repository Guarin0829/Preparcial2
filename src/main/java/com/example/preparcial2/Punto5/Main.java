package com.example.preparcial2.Punto5;

public class Main {

    public static void main(String[] args) {
        String cadena1 = "(6-7)/4]";
        String cadena2 = "[(1+2)*4]+5";

        System.out.println("La cadena \"" + cadena1 + "\" está balanceada: " + estanBalanceados(cadena1));
        System.out.println("La cadena \"" + cadena2 + "\" está balanceada: " + estanBalanceados(cadena2));
    }

    // Método para verificar si los paréntesis, llaves y corchetes están balanceados
    public static boolean estanBalanceados(String cadena) {
        Pila<Character> pila = new Pila<>();

        // Recorremos cada carácter en la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            // Si es un paréntesis, llave o corchete de apertura, lo agregamos a la pila
            if (caracter == '(' || caracter == '[' || caracter == '{') {
                pila.push(caracter);
            }
            // Si es un paréntesis, llave o corchete de cierre
            else if (caracter == ')' || caracter == ']' || caracter == '}') {
                // Verificamos si la pila está vacía
                if (pila.estaVacia()) {
                    return false; // Si está vacía, los paréntesis no están balanceados
                }
                // Si no está vacía, obtenemos el último carácter de la pila
                char ultimoCaracter = pila.pop();
                // Comparamos el último carácter de la pila con el carácter actual
                if ((caracter == ')' && ultimoCaracter != '(') ||
                        (caracter == ']' && ultimoCaracter != '[') ||
                        (caracter == '}' && ultimoCaracter != '{')) {
                    return false; // Si no coinciden, los paréntesis no están balanceados
                }
            }
        }

        // Al final, si la pila está vacía, significa que todos los paréntesis, llaves y corchetes están balanceados
        return pila.estaVacia();
    }


}

