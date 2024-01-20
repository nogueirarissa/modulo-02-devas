package br.com.ada.pooii.aula04;

import java.util.Arrays;
import java.util.List;

public class MetodosGenericosPrincipal {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3);
        Util.swapElementos(lista,0,1);

        Integer maior = Util.encontrarMaiorElemento(lista);
        System.out.println(lista);
        System.out.println("Maior: "+maior);
    }
}
