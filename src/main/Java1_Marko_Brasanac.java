package main;

import media.Television;
import media.Radio;

public class Java1_Marko_Brasanac {

    public static void main(String[] args) {

        Television tv1 = new Television();
        tv1.showData();

        tv1.setVolume(0);
        tv1.setCurrentProgram(1);
        tv1.setTurnOn(true);

        Radio radio1 = new Radio;
        radio1.showData();

        radio1.setFmFrequency(91.8);
        radio1.setAmFrequency(600);
        radio1.setBand('A');

    }

}
