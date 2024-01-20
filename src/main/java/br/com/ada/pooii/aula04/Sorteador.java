package br.com.ada.pooii.aula04;

import java.util.Random;

public class Sorteador {

    private Object [] arrayParaSorteio;

    public Sorteador (Object[] arrayParaSorteio){
        this.arrayParaSorteio = arrayParaSorteio;
    }

    public Object sorteio(){
        // obtendo um numero randomico
        Random random = new Random();
        int numeroRandomico = random.nextInt(arrayParaSorteio.length);

        // escolhe, baseado no numero randômico, um valor no array
        Object retorno = this.arrayParaSorteio[numeroRandomico];

        // retornei o objeto sorteado
        return retorno;
    }

}
