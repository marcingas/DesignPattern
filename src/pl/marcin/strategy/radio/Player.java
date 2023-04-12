package pl.marcin.strategy.radio;

import java.util.Random;

public class Player {
    public static void main(String[] args) {
       //anytime you switch on radio you will hear different music:
        switchOnRadio();
    }

    public static void switchOnRadio(){
        Radio radio = new Radio();
        System.out.println("Radio is on");
        System.out.println(radio.getSong());

    }

}
