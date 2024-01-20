package br.com.ada.pooii.aula02;

public class Bicicleta extends Veiculo{


    @Override
        public void acelerar() {
            if (getVelocidade() == 40) {
                System.out.println("\nMinhas pernas estão falhando, não consigo acelerar mais");
            } else {
                setVelocidade(getVelocidade() + 5);
            }
        }

        @Override
        public void frear() {
            if (getVelocidade() == 0) {
                System.out.println("\nA bicicleta já está parada.");
            } else {
                setVelocidade(getVelocidade() - 5);
            }
        }

    @Override
    public void status() {
        System.out.printf("\nA bicicleta está a %d km/h ", getVelocidade());
    }
}

