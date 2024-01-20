package br.com.ada.pooii.aula04;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] nomes = {"maria", "joana", "laura", "erica"};
        String nome = (String) new Sorteador(nomes).sorteio();
        System.out.println(nome.toUpperCase());

        List<String> nomesList = Arrays.asList("maria", "joana", "laura", "erica");
        String nomeEscolhido = new SorteadorGenerico<>(nomesList).sorteio();
        System.out.println(nomeEscolhido.toUpperCase());
    }
}
