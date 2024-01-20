package br.com.ada.pooii.aula02;

public abstract class Veiculo {
    private int velocidade;

    //Metodos de acesso e modificação
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    //Métodos abstratos da classe Veiculo
    public abstract void acelerar();

    public abstract void frear();

    public abstract void status();
}

