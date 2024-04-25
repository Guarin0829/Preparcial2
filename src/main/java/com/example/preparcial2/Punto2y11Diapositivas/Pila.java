package com.example.preparcial2.Punto2y11Diapositivas;

public class Pila<T> {

    private Nodo<T> cima;
    private int tamano;

    public boolean estaVacia() {

        return cima==null;
    }

    public void push(T dato) {

        Nodo<T> nodo = new Nodo<>(dato);
        nodo.setSiguienteNodo(cima);
        cima = nodo;

        tamano++;
    }

    public T pop() {

        if(estaVacia()) {
            throw new RuntimeException("La Pila est� vac�a");
        }

        T dato = cima.getValorNodo();
        cima = cima.getSiguienteNodo();
        tamano--;

        return dato;
    }

    public void borrarPila() {
        cima = null;
        tamano = 0;
    }

    public T obtenerCima() {

        return cima.getValorNodo();
    }

    public Nodo<T> getCima() {

        return cima;
    }

    public int getTamano() {

        return tamano;
    }

    public void agregar(Pila<T> pila) {

        Pila<T> clon = pila.clone();
        Pila<T> aux = new Pila<>();

        while(!clon.estaVacia()) {
            aux.push(clon.pop());
        }

        while(!aux.estaVacia()) {
            push(aux.pop());
        }

    }

    public void imprimir() {
        Nodo<T> aux = cima;
        while(aux!=null) {
            System.out.print(aux.getValorNodo()+"\t");
            aux = aux.getSiguienteNodo();
        }
        System.out.println();
    }

    @Override
    protected Pila<T> clone(){

        Pila<T> pilaFinal = new Pila<>();
        Nodo<T> nodoCima = null;

        for (Nodo<T> aux = cima; aux!=null; aux = aux.getSiguienteNodo()) {

            Nodo<T> nuevo = new Nodo<>( aux.getValorNodo() );

            if(pilaFinal.estaVacia()) {
                pilaFinal.cima = nuevo;
                nodoCima = nuevo;
            }else {
                pilaFinal.cima.setSiguienteNodo(nuevo);
                pilaFinal.cima = nuevo;
            }
            pilaFinal.tamano++;

        }

        pilaFinal.cima = nodoCima;

        return pilaFinal;
    }

}
