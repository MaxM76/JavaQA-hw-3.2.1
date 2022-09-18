import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {
    private final int stationsCountToSet = 15;
    private final int minimumVolumeLevel = 0;
    private final int maximumVolumeLevel = 100;
    private final int correctVolumeToSet = 50;
    private final int incorrectHighVolumeToSet = maximumVolumeLevel + 50;
    private final int incorrectLowVolumeToSet = minimumVolumeLevel - 50;
    private final int minimumStationIndex = 0;
    private final int maximumStationIndex = stationsCountToSet - 1;
    private final int correctStationIndexToSet = 7;
    private final int incorrectHighStationIndexToSet = maximumStationIndex + 5;
    private final int incorrectLowStationIndexToSet = -5;

    Radio service = new Radio(stationsCountToSet);

    @Test
    void shouldSetVolumeFromValueWithinAllowedInterval() {
        service.setVolume(correctVolumeToSet);
        int actual = service.getVolume();
        assertEquals(correctVolumeToSet, actual);
    }

    @Test
    void shouldSetMinimalVolumeFromValueWithinAllowedInterval() {
        service.setVolume(minimumVolumeLevel);
        int actual = service.getVolume();
        assertEquals(minimumVolumeLevel, actual);
    }

    @Test
    void shouldSetMaximalVolumeFromValueWithinAllowedInterval() {
        service.setVolume(maximumVolumeLevel);
        int actual = service.getVolume();
        assertEquals(maximumVolumeLevel, actual);
    }

    @Test
    void shouldSetMinimalVolumeFromValueBelowAllowedInterval() {
        service.setVolume(incorrectLowVolumeToSet);
        int actual = service.getVolume();
        assertEquals(minimumVolumeLevel, actual);
    }

    @Test
    void shouldSetMaximalVolumeFromValueExceedAllowedInterval() {
        service.setVolume(incorrectHighVolumeToSet);
        int actual = service.getVolume();
        assertEquals(maximumVolumeLevel, actual);
    }

    @Test
    void shouldUpVolumeLevel() {
        service.setVolume(correctVolumeToSet);
        int expected = correctVolumeToSet + 1;
        service.increaseVolume();
        int actual = service.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotUpVolumeLevel() {
        service.setVolume(maximumVolumeLevel);
        service.increaseVolume();
        int actual = service.getVolume();
        assertEquals(maximumVolumeLevel, actual);
    }

    @Test
    void shouldDownVolumeLevel() {
        service.setVolume(correctVolumeToSet);
        int expected = correctVolumeToSet - 1;
        service.decreaseVolume();
        int actual = service.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDownVolumeLevel() {
        service.setVolume(minimumVolumeLevel);
        service.decreaseVolume();
        int actual = service.getVolume();
        assertEquals(minimumVolumeLevel, actual);
    }

    @Test
    void shouldSetStationFromValueWithinAllowedInterval() {
        service.setStation(correctStationIndexToSet);
        int actual = service.getStation();
        assertEquals(correctStationIndexToSet, actual);
    }

    @Test
    void shouldSetFirstStationFromValueWithinAllowedInterval() {
        service.setStation(minimumStationIndex);
        int actual = service.getStation();
        assertEquals(minimumStationIndex, actual);
    }

    @Test
    void shouldSetLastStationFromValueWithinAllowedInterval() {
        service.setStation(maximumStationIndex);
        int actual = service.getStation();
        assertEquals(maximumStationIndex, actual);
    }

    @Test
    void shouldNotSetStationFromValueBelowAllowedInterval() {
        int expected = service.getStation();
        service.setStation(incorrectLowStationIndexToSet);
        int actual = service.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetStationFromValueExceedAllowedInterval() {
        int expected = service.getStation();
        service.setStation(incorrectHighStationIndexToSet);
        int actual = service.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchToNextStation() {
        service.setStation(correctStationIndexToSet);
        int expected = correctStationIndexToSet + 1;
        service.nextStation();
        int actual = service.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchToPreviousStation() {
        service.setStation(correctStationIndexToSet);
        int expected = correctStationIndexToSet - 1;
        service.prevStation();
        int actual = service.getStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSwitchToFirstStationFromLastStation() {
        service.setStation(maximumStationIndex);
        service.nextStation();
        int actual = service.getStation();
        assertEquals(minimumStationIndex, actual);
    }

    @Test
    void shouldSwitchToLastStationFromFirstStation() {
        service.setStation(minimumStationIndex);
        service.prevStation();
        int actual = service.getStation();
        assertEquals(maximumStationIndex, actual);
    }
}