import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @org.junit.jupiter.api.Test
    void shouldSetVolumeFromValueWithinAllowedInterval() {
        Radio service = new Radio();

        // подготавливаем данные:
        int volumeToSet = 5;
        int expected = volumeToSet;

        // вызываем целевой метод:
        service.setVolume(volumeToSet);
        int actual = service.getVolume();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSetMinimalVolumeFromValueWithinAllowedInterval() {
        Radio service = new Radio();

        // подготавливаем данные:
        int volumeToSet = 0;
        int expected = volumeToSet;

        // вызываем целевой метод:
        service.setVolume(volumeToSet);
        int actual = service.getVolume();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSetMaximalVolumeFromValueWithinAllowedInterval() {
        Radio service = new Radio();

        // подготавливаем данные:
        int volumeToSet = 10;
        int expected = volumeToSet;

        // вызываем целевой метод:
        service.setVolume(volumeToSet);
        int actual = service.getVolume();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSetMinimalVolumeFromValueBelowAllowedInterval() {
        Radio service = new Radio();

        // подготавливаем данные:
        int volumeToSet = -10;
        int expected = 0;

        // вызываем целевой метод:
        service.setVolume(volumeToSet);
        int actual = service.getVolume();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSetMaximalVolumeFromValueExceedAllowedInterval() {
        Radio service = new Radio();

        // подготавливаем данные:
        int volumeToSet = 100;
        int expected = 10;

        // вызываем целевой метод:
        service.setVolume(volumeToSet);
        int actual = service.getVolume();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldUpVolumeLevel() {
        Radio service = new Radio();

        // подготавливаем данные:
        int volumeToSet = 5;
        service.setVolume(volumeToSet);
        int expected = volumeToSet + 1;

        // вызываем целевой метод:
        service.increaseVolume();
        int actual = service.getVolume();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldNotUpVolumeLevel() {
        Radio service = new Radio();

        // подготавливаем данные:
        int volumeToSet = 10;
        service.setVolume(volumeToSet);
        int expected = volumeToSet;

        // вызываем целевой метод:
        service.increaseVolume();
        int actual = service.getVolume();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldDownVolumeLevel() {
        Radio service = new Radio();

        // подготавливаем данные:
        int volumeToSet = 5;
        service.setVolume(volumeToSet);
        int expected = volumeToSet - 1;

        // вызываем целевой метод:
        service.decreaseVolume();
        int actual = service.getVolume();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldNotDownVolumeLevel() {
        Radio service = new Radio();

        // подготавливаем данные:
        int volumeToSet = 0;
        service.setVolume(volumeToSet);
        int expected = volumeToSet;

        // вызываем целевой метод:
        service.decreaseVolume();
        int actual = service.getVolume();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSetStationFromValueWithinAllowedInterval() {
        Radio service = new Radio();

        // подготавливаем данные:
        int stationToSet = 5;
        int expected = stationToSet;

        // вызываем целевой метод:
        service.setStation(stationToSet);
        int actual = service.getStation();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSetFirstStationFromValueWithinAllowedInterval() {
        Radio service = new Radio();

        // подготавливаем данные:
        int stationToSet = 0;
        int expected = stationToSet;

        // вызываем целевой метод:
        service.setStation(stationToSet);
        int actual = service.getStation();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSetLastStationFromValueWithinAllowedInterval() {
        Radio service = new Radio();

        // подготавливаем данные:
        int stationToSet = 9;
        int expected = stationToSet;

        // вызываем целевой метод:
        service.setStation(stationToSet);
        int actual = service.getStation();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldNotSetStationFromValueBelowAllowedInterval() {
        Radio service = new Radio();

        // подготавливаем данные:
        int stationToSet = -9;
        int expected = service.getStation();

        // вызываем целевой метод:
        service.setStation(stationToSet);
        int actual = service.getStation();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldNotSetStationFromValueExceedAllowedInterval() {
        Radio service = new Radio();

        // подготавливаем данные:
        int stationToSet = 19;
        int expected = service.getStation();

        // вызываем целевой метод:
        service.setStation(stationToSet);
        int actual = service.getStation();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSwitchToNextStation() {
        Radio service = new Radio();

        // подготавливаем данные:
        int stationToSet = 5;
        service.setStation(stationToSet);
        int expected = stationToSet + 1;

        // вызываем целевой метод:
        service.nextStation();
        int actual = service.getStation();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSwitchToPreviousStation() {
        Radio service = new Radio();

        // подготавливаем данные:
        int stationToSet = 5;
        service.setStation(stationToSet);
        int expected = stationToSet - 1;

        // вызываем целевой метод:
        service.prevStation();
        int actual = service.getStation();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSwitchToFirstStationFromLastStation() {
        Radio service = new Radio();

        // подготавливаем данные:
        int stationToSet = 9;
        service.setStation(stationToSet);
        int expected = 0;

        // вызываем целевой метод:
        service.nextStation();
        int actual = service.getStation();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldSwitchToLastStationFromFirstStation() {
        Radio service = new Radio();

        // подготавливаем данные:
        int stationToSet = 0;
        service.setStation(stationToSet);
        int expected = 9;

        // вызываем целевой метод:
        service.prevStation();
        int actual = service.getStation();

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}