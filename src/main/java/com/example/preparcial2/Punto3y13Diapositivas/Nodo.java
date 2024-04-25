package com.example.preparcial2.Punto3y13Diapositivas;

public class Nodo<T> {

    private Nodo<T> siguienteNodo;
    private T valorNodo;

    public Nodo(T valorNodo) {

        this.valorNodo = valorNodo;
    }

    public Nodo(T dato, Nodo<T> siguiente) {
        super();
        this.valorNodo = dato;
        this.siguienteNodo = siguiente;
    }

    public Nodo<T> getSiguienteNodo() {

        return siguienteNodo;
    }


    public void setSiguienteNodo(Nodo<T> siguienteNodo) {

        this.siguienteNodo = siguienteNodo;
    }


    public T getValorNodo() {

        return valorNodo;
    }


    public void setValorNodo(T valorNodo) {

        this.valorNodo = valorNodo;
    }
}


