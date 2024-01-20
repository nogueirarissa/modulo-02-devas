package br.com.ada.pooii.aula04;
import java.util.List;
import java.util.Random;

public class SorteadorGenerico <T>{

    private List<T> array;

    public SorteadorGenerico(List<T>array){
        //prefira listas a array
        //sempre tentar eliminar os warnings, ex. @SupressWarnings("unchecked")
        this.array = array;
    }

    public T sorteio(){
        // obtendo um numero randomico
        Random random = new Random();//classe do Java
        int numeroRandomico = random.nextInt(array.size());

        // escolhe, baseado no numero randômico, um valor no array
        T retorno = this.array.get(numeroRandomico);

        // retornei o objeto sorteado
        return retorno;
    }
}
