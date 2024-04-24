package com.example.preparcial2.Punto1;

import java.util.Iterator;

public class ListaSimple<T> implements Iterable<T> {

    private Nodo<T> nodoPrimero;
    private Nodo<T> nodoUltimo;
    private int tamanio;


    public ListaSimple() {
        nodoPrimero = null;
        nodoUltimo = null;
        tamanio = 0;
    }

    public void agregarInicio(T valorNodo) {
        Nodo<T> nuevoNodo = new Nodo<>(valorNodo);
        if (estaVacia()) {
            nodoPrimero = nuevoNodo;
            nodoUltimo = nuevoNodo;
        } else {
            nuevoNodo.setSiguienteNodo(nodoPrimero);
            nodoPrimero = nuevoNodo;
        }
        tamanio++;
    }

    public void agregarfinal(T valorNodo) {
        Nodo<T> nodo = new Nodo<>(valorNodo);

        if (estaVacia()) {
            nodoPrimero = nodoUltimo = nodo;
        } else {
            nodoUltimo.setSiguienteNodo(nodo);
            nodoUltimo = nodo;
        }
        tamanio++;
    }

    public boolean estaVacia() {

        return (nodoPrimero == null) ? true : false;
    }

    public void imprimirLista() {

        Nodo<T> aux = nodoPrimero;

        while (aux != null) {
            System.out.print(aux.getValorNodo() + "\t");
            aux = aux.getSiguienteNodo();
        }

        System.out.println();
    }

    public T eliminarPrimero() {

        if (!estaVacia()) {
            Nodo<T> n = nodoPrimero;
            T valor = n.getValorNodo();
            nodoPrimero = n.getSiguienteNodo();

            if (nodoPrimero == null) {
//				nodoUltimo = null;
            }

            tamanio--;
            return valor;
        }

        throw new RuntimeException("Lista vac�a");
    }

    @Override
    public Iterator<T> iterator() {

        return new IteradorListaSimple(nodoPrimero);
    }


    public class IteradorListaSimple implements Iterator<T> {
        private Nodo<T> nodo;
        private int posicion;

        public IteradorListaSimple(Nodo<T> nodo) {
            this.nodo = nodo;
            this.posicion = 0;
        }

        @Override
        public boolean hasNext() {
            return nodo != null;
        }

        @Override
        public T next() {
            T valor = nodo.getValorNodo();
            nodo = nodo.getSiguienteNodo();// i++;
            posicion++;
            return valor;
        }

        public int getPosicion() {
            return posicion;
        }

    }

    public Nodo<T> getNodoPrimero() {

        return nodoPrimero;
    }


    public void setNodoPrimero(Nodo<T> nodoPrimero) {

        this.nodoPrimero = nodoPrimero;
    }


    public int getTamanio() {

        return tamanio;
    }


    public void setTamanio(int tamanio) {

        this.tamanio = tamanio;
    }

    public ListaSimple<T> invertirConPilas() {
        Pila<T> pila = new Pila<>();

        for (T elemento : this) {
            pila.push(elemento);
        }

        ListaSimple<T> listaInvertida = new ListaSimple<>();

        while (!pila.estaVacia()) {
            listaInvertida.agregarfinal(pila.pop());
        }

        return listaInvertida;
    }




}