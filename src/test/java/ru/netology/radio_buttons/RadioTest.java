package ru.netology.radio_buttons;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void testSetNextStationFromZero() {
        Radio radio = new Radio();
        radio.nextStation();
        byte expected = 1;
        byte actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetNextStationFromEight() {
        Radio radio = new Radio();
        radio.setStationNumber(8);
        radio.nextStation();
        byte expected = 9;
        byte actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetNextStationFromNine() {
        Radio radio = new Radio();
        radio.setStationNumber(9);
        radio.nextStation();
        byte expected = 0;
        byte actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetPrevStationFromZero() {
        Radio radio = new Radio();
        radio.prevStation();
        byte expected = 9;
        byte actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetPrevStationFromOne() {
        Radio radio = new Radio();
        radio.setStationNumber(1);
        radio.prevStation();
        byte expected = 0;
        byte actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetPrevStationFromNine() {
        Radio radio = new Radio();
        radio.setStationNumber(9);
        radio.prevStation();
        byte expected = 8;
        byte actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCorrectStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(9);
        byte expected = 9;
        byte actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetOverMaxStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(10);
        byte expected = 0;
        byte actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetUnderMinStationNumber() {
        Radio radio = new Radio();
        radio.setStationNumber(-1);
        byte expected = 0;
        byte actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testIncreaseVolumeToZero() {
        Radio radio = new Radio();
        radio.increaseVolume();
        byte expected = 1;
        byte actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeToNinetyNine() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.increaseVolume();
        byte expected = 100;
        byte actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeToFifty() {
        Radio radio = new Radio();
        radio.setVolume(50);
        radio.increaseVolume();
        byte expected = 51;
        byte actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testIncreaseVolumeFromHundred() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        byte expected = 100;
        byte actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testDecreaseVolumeToZero() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.decreaseVolume();
        byte expected = 0;
        byte actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeToNinetyNine() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.decreaseVolume();
        byte expected = 99;
        byte actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDecreaseVolumeFromZero() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        byte expected = 0;
        byte actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetIncorrectVolume() {
        Radio radio = new Radio();
        radio.setVolume(110);
        byte expected = 0;
        byte actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetNegativeVolume() {
        Radio radio = new Radio();
        radio.setVolume(-110);
        byte expected = 0;
        byte actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCorrectVolume() {
        Radio radio = new Radio();
        radio.setVolume(96);
        byte expected = 96;
        byte actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}