package br.com.ada.pooii.aula01;

public abstract class Funcionario {

        protected String nome; // o protected permite que os filhos acessem esta variável.
        protected double salario;

        public Funcionario (String nome, double salario){
            this.nome = nome;
            this.salario = salario;
        }

        public abstract double getBonus();

}
/*
diferença entre a classe abstrata e a interface é que: para a classe abstrata não consigo
é possível herdar mais de uma classe. Já na interface, é possível implementar mais de uma interface.
== compara endereço na memória. O .equals compara o valor.
Se o equals não for sobreescrito, ele herdara da classe pai que é Object. Logo ele comprarará com ==, ou seja o
endereço na memória. O caso da string é que já está sobrescrito, pois é uma classe implementada, não um tipo primitivo.
*/

