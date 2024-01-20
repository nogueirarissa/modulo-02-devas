package br.com.ada.pooii.aula04;

import java.util.List;


public class Util {
    //metodo para trocar a posição de elemento
    public static <T> void swapElementos(List<T> lista, int de, int para){
        /*validações
        Integer elementoDe = lista.get(de);
        Integer elementosPara = lista.get(para);*/

        // salvando elementos temporariamente
        T elementoDe = lista.get(de);
        T elementoPara = lista.get(para);

        // swapping elementos
        lista.set(de, elementoPara);
        lista.set(para, elementoDe);
    }

    //metodo para encontrar o maior elemento

    //como comparar uma string com um inteiro? Temos que delimitar
    // T extends Comparable<T> recurso de genérico limitado
    public static <T extends Comparable<T>> T encontrarMaiorElemento(List<T> lista){
        if (lista.isEmpty()){
            return null;
        }
        T maiorElemento  = lista.get(0);

        for (T elemento : lista){
            if (elemento.compareTo(maiorElemento) > 0){
                maiorElemento = elemento;
            }
        }
        return maiorElemento;
    }

}
