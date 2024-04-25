package com.example.preparcial2.DiapositivasTaller.Punto8;

import com.example.preparcial2.DiapositivasTaller.Pila;

public class Main {

    public static void main(String[] args) {
        String expresionPostfija = "78+32+/ ";
        double resultado = evaluarExpresionPostfija(expresionPostfija);
        System.out.println("Expresión postfija " + expresionPostfija +"\n"+ "Resultado: " + resultado);
    }

    public static double evaluarExpresionPostfija(String expresion) {
        Pila<Double> pila = new Pila<>();

        for (char caracter : expresion.toCharArray()) {
            if (Character.isDigit(caracter)) {
                // Si es un dígito, lo convertimos a double y lo agregamos a la pila
                pila.push((double) (caracter - '0'));
            } else if (esOperador(caracter)) {
                // Si es un operador, realizamos la operación correspondiente
                double operand2 = pila.pop();
                double operand1 = pila.pop();
                double resultadoOperacion = realizarOperacion(caracter, operand1, operand2);
                pila.push(resultadoOperacion);
            }
        }

        // Al final, el resultado estará en la cima de la pila
        return pila.pop();
    }

    private static boolean esOperador(char caracter) {
        return caracter == '+' || caracter == '-' || caracter == '*' || caracter == '/';
    }

    private static double realizarOperacion(char operador, double operand1, double operand2) {
        switch (operador) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("División por cero");
                }
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Operador no válido: " + operador);
        }
    }

}
