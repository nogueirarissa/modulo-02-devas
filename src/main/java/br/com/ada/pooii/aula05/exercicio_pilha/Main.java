package br.com.ada.pooii.aula05.exercicio_pilha;

public class Main {
    public static void main(String[] args) {

        Stack<String> minhaStack = new StackImpl<>();

        minhaStack.push("lais");
        minhaStack.push("tuma");
        minhaStack.push("livia");
        minhaStack.push("larissa");

        System.out.println("Elemento do topo: " + minhaStack.peek());
        System.out.println("Elemento desempilhado: " + minhaStack.pop()); //Last in First Out
        System.out.println("Elemento do topo atualizado: " + minhaStack.peek());
        System.out.println("A pilha está vazia? " + minhaStack.isEmpty());
    }
}
