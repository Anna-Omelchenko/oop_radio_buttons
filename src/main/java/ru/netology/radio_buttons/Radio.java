package ru.netology.radio_buttons;

public class Radio {
    private byte currentStation;
    private byte currentVolume;

    public byte getCurrentStation() {
        return currentStation;
    }

    public byte getCurrentVolume() {
        return currentVolume;
    }


    public void setStationNumber(int newStation) {
        if (newStation >= 0 && newStation <= 9) {
            currentStation = (byte) newStation;
        }
    }

    public void setVolume(int newVolume) {
        if (newVolume >= 0 && newVolume <= 100) {
            currentVolume = (byte) newVolume;
        }
    }

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

}