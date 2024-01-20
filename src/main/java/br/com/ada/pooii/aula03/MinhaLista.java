package br.com.ada.pooii.aula03;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista<T extends ObjetoComID<U>, U>{

    /*
    Usando Generics, os parâmetros de tipo não podem ser estáticos.
    Como a variável estática é compartilhada entre os objetos, o compilador
    não pode determinar qual tipo usar.
    */

    private final List<T> elementos = new ArrayList<>(); //<> a partir do java 7, uma vez delimitado no lado esquerdo, ele automaticamente entende que é do tipo <T>, neste caso.

    /* O final previne que alguem atribua uma nova lista e os dados
    preexistentes sejam perdidos.
    */

    public void adicionar (T elemento) {
        this.elementos.add(elemento);
    }

    public T obter(int indice){
        if (indice >= 0 && indice < elementos.size()){
            T objetoEncontrado = this.elementos.get(indice);
            return objetoEncontrado;
        }
        throw new IndexOutOfBoundsException("Posição do Índice Inválida");
    }

    /*Generic Bounded */
    public int indice(U id){
        for (int i = 0; i <this.elementos.size(); i++){
            T elementosDaPosicao = this.elementos.get(i);
            boolean isIgual = elementosDaPosicao.getId().equals(id);
            if (isIgual){
                return i;
            }
        }
        return -1;
    }

    public boolean contem (T elemento){
        boolean isElementosNaLista = this.elementos.contains(elemento);
        return isElementosNaLista;
    }

}
