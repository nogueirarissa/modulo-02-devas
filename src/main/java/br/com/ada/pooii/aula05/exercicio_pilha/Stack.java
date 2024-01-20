package br.com.ada.pooii.aula05.exercicio_pilha;

// Interface genérica para a estrutura Stack
public  interface  Stack<E> {
	void  push(E elemento);
	E pop();
	E peek();
	boolean  isEmpty();
}