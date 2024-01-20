package br.com.ada.pooii.aula02;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Bicicleta bike = new Bicicleta();
        Carro car = new Carro();
        Moto moto = new Moto();

        // Bicicleta
        bike.acelerar();
        bike.status();
        bike.frear();
        bike.status();

        //Carro
        car.acelerar();
        car.status();
        car.ligar();
        car.frear();
        car.acelerar();
        car.acelerar();
        car.status();


        //Moto
        moto.acelerar();
        moto.status();
        moto.ligar();
        moto.frear();
        moto.acelerar();
        moto.acelerar();
        moto.status();


    }

}
