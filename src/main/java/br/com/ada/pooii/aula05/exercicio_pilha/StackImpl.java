package br.com.ada.pooii.aula05.exercicio_pilha;

import java.util.ArrayList;
import java.util.List;

public class StackImpl <E> implements Stack <E>{

    private final List<E> listaInterna;
    public StackImpl(){
        this.listaInterna = new ArrayList<>();
    }

    //adiciona um elemento a pilha
    @Override
    public void push(E elemento) {
        listaInterna.add(elemento);
    }

    //tira o elemento no topo da pilha
    @Override
    public E pop() {
        if (isEmpty()){
            throw new IllegalStateException("A pilha está vazia. Não é possível realizar a ação.");
        }
        return listaInterna.remove(listaInterna.size()-1);
    }

    //busca o elemento no topo da pilha
    @Override
    public E peek() {
        if (isEmpty()){
            throw new IllegalStateException("A pilha está vazia.");
        }
        return listaInterna.get(listaInterna.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return listaInterna.isEmpty();
    }
}
