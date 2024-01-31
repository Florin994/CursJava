package curs4.Teme.Radio;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio(new ArrayList<>(Arrays.asList("Ks FM", "Rock FM", "Pro FM", "Radio Zu", "Classic FM")));
        radio.displayRadioStatus();
        radio.turnOn();
        radio.displayRadioStatus();
        radio.turnOn();
        radio.displayRadioStatus();

        for (int i = 0; i < 10; i++) {
            radio.turnVolumeUp();
        }
        radio.displayRadioStatus();
        radio.turnVolumeUp();
        radio.displayRadioStatus();
        radio.turnVolumeDown();
        radio.turnVolumeDown();
        radio.turnVolumeDown();
        radio.displayRadioStatus();
        for (int i = 0; i < 10; i++) {
            radio.turnVolumeDown();
        }
        radio.displayRadioStatus();
        radio.turnVolumeUp();
        radio.turnVolumeUp();
        radio.turnVolumeUp();
        radio.displayRadioStatus();
        for (int i = 0; i < 6; i++) {
            radio.changePostForward();
            radio.displayRadioStatus();
        }
        for (int i = 0; i < 6; i++) {
            radio.changePostBackwards();
            radio.displayRadioStatus();
        }
        radio.turnOff();
        radio.displayRadioStatus();
    }
}
