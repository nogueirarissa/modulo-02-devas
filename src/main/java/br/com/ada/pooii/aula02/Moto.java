package br.com.ada.pooii.aula02;

public class Moto extends Veiculo implements VeiculoMotorizado{

    private boolean motoOn;

    public Moto() {
        this.motoOn = false;
    }

    public boolean isMotoOn() {
        return motoOn;
    }

    public void setCarroOn(boolean motoOn) {
        this.motoOn = motoOn;
    }

    @Override
    public void acelerar() {
        if (isMotoOn()) {
            setVelocidade(getVelocidade() + 10);
        } else {
            System.out.println("\nLigue a moto antes de tentar acelerar.");
        }
    }

    @Override
    public void frear() {
        if (getVelocidade() <= 0) {
            System.out.println("\nA moto está parada e com o motor ligado");
        } else {
            setVelocidade(getVelocidade() - 10);
        }
    }

    @Override
    public void ligar() {
        setCarroOn(true);
        System.out.println("\nA moto foi ligada");
    }

    @Override
    public void desligar() {
        setCarroOn(false);
        System.out.println("\nA moto foi desligada");
    }
    @Override
    public void status() {
        System.out.printf("\nStatus da moto: %s, velocidade: %d km/h", isMotoOn() ? "ligada" : "desligado", getVelocidade());
    }
}
