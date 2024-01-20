package br.com.ada.pooii.aula02;

public class Carro extends Veiculo implements VeiculoMotorizado{

    private boolean carroOn;

    public Carro() {
        this.carroOn = false;
    }

    public boolean isCarroOn() {
        return carroOn;
    }

    public void setCarroOn(boolean carroOn) {
        this.carroOn = carroOn;
    }

    @Override
    public void acelerar() {
        if (isCarroOn()) {
            setVelocidade(getVelocidade() + 10);
        } else {
            System.out.println("\nLigue o carro antes de tentar acelerar.");
        }
    }

    @Override
    public void frear() {
        if (getVelocidade() <= 0) {
            System.out.println("\nO carro está parado e com o motor ligado");
        } else {
            setVelocidade(getVelocidade() - 10);
        }
    }

    @Override
    public void ligar() {
        setCarroOn(true);
        System.out.println("\nO carro foi ligado");
    }

    @Override
    public void desligar() {
        setCarroOn(false);
        System.out.println("\nO carro foi desligado");
    }
    @Override
    public void status() {
        System.out.printf("\nStatus do carro: %s, velocidade: %d km/h", isCarroOn() ? "ligado" : "desligado", getVelocidade());
    }
}