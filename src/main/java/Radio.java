public class Radio {
    public int currentVolume;
    public int currentStation;

    public void setStation(int station) {
        if ((station >= 0) & (station <= 9)) {
            currentStation = station;
        }
    }

    public int getStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation == 9) {
            setStation(0);
        } else {
            setStation(currentStation + 1);
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            setStation(9);
        } else {
            setStation(currentStation - 1);
        }
    }


    public void setVolume(int volume) {
        if (volume < 0) {
            currentVolume = 0;
        } else if (volume > 10) {
            currentVolume = 10;
        } else {
            currentVolume = volume;
        }
    }

    public int getVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}