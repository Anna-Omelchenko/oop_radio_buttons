package ru.netology.radio_buttons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioMultiStationsTest {
    @Test
    public void testDefaultNumberOfStations() {
        Radio radio = new Radio();
        Assertions.assertEquals(10, radio.getNumberOfStations());
    }

    @Test
    public void testCustomNumberOfStations() {
        byte numOfStations = 20;
        Radio radio = new Radio(numOfStations);
        Assertions.assertEquals(numOfStations, radio.getNumberOfStations());
    }

    @Test
    public void testInvalidNumberOfStations() {
        Radio radio = new Radio((byte) 0);
        Assertions.assertEquals((byte) 10, radio.getNumberOfStations());
    }

}
