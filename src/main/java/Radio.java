public class Radio {
    protected int currentVolume;
    protected int currentStation;
    protected int stationsCount;

    public Radio() {
        this.stationsCount = 10;
        this.currentVolume = 0;
        this.currentStation = 0;
    }

    public Radio(int stationsCount) {
        if (stationsCount > 0) {
            this.stationsCount = stationsCount;
        } else {
            this.stationsCount = 10;
        }
        this.currentVolume = 0;
        this.currentStation = 0;
    }

    public int getStationsCount() {
        return stationsCount;
    }

    public void setStation(int station) {
        if ((station >= 0) & (station <= (getStationsCount() - 1))) {
            currentStation = station;
        }
    }

    public int getStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation == (getStationsCount() - 1)) {
            setStation(0);
        } else {
            setStation(currentStation + 1);
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            setStation(getStationsCount() - 1);
        } else {
            setStation(currentStation - 1);
        }
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            currentVolume = 0;
        } else if (volume > 100) {
            currentVolume = 100;
        } else {
            currentVolume = volume;
        }
    }

    public int getVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

}