package ru.netology.radio_buttons;

public class Radio {
    private byte numberOfStations = 10;
    private byte currentStation;
    private byte currentVolume;

    public Radio() {
    }

    public Radio(byte numberOfStations) {
        if (numberOfStations > 0) {
            this.numberOfStations = numberOfStations;
        }
    }

    public byte getNumberOfStations() {
        return numberOfStations;
    }

    public byte getCurrentStation() {
        return currentStation;
    }

    public byte getCurrentVolume() {
        return currentVolume;
    }


    public void setStationNumber(int newStation) {
        if (newStation >= 0 && newStation < numberOfStations) {
            currentStation = (byte) newStation;
        }
    }

    public void setVolume(int newVolume) {
        if (newVolume >= 0 && newVolume <= 100) {
            currentVolume = (byte) newVolume;
        }
    }

    public void nextStation() {
        if (currentStation == numberOfStations - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = (byte) (numberOfStations - 1);
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