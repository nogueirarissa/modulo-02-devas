package br.com.ada.pooii.aula03;

public class Main {
    public static void main(String[] args) {

        MinhaLista<Pessoa, Long> listaDePessoas = new MinhaLista<>();

        var jorge = new Pessoa(1, "jorge");
        listaDePessoas.adicionar(jorge);

        var maria = new Pessoa(2, "maria");
        listaDePessoas.adicionar(maria);

        var jess = new Pessoa(3, "jess");
        listaDePessoas.adicionar(jess);

        System.out.println("Elemento na posição 2: " + listaDePessoas.obter(2)); // Saída: Pessoa[id=3, nome="jess]
        System.out.println("A lista contém a pessoa maria? " + listaDePessoas.contem(maria)); // Saída: true
        System.out.println("Qual a posicao do elemento de ID 3? " + listaDePessoas.indice(3L)); // Saída: 2
    }
}
