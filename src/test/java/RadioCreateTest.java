import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioCreateTest {
    private int defaultStationsCount = 10;
    private int initialVolumeLevel = 0;
    private int initialCurrentStation = 0;

    @Test
    void shouldCreateRadioWithDefaultStationsCount() {
        Radio service = new Radio();
        // производим проверку
        assertEquals(defaultStationsCount, service.getStationsCount());
        assertEquals(initialCurrentStation, service.getStation());
        assertEquals(initialVolumeLevel, service.getVolume());
    }

    @Test
    void shouldCreateRadioWithProperGivenStationsCount() {
        int stationsCountToSet = 15;
        Radio service = new Radio(stationsCountToSet);

        // производим проверку:
        assertEquals(stationsCountToSet, service.getStationsCount());
        assertEquals(initialCurrentStation, service.getStation());
        assertEquals(initialVolumeLevel, service.getVolume());
    }

    @Test
    void shouldCreateRadioWithImproperGivenStationsCount() {
        int stationsCountToSet = -5;
        Radio service = new Radio(stationsCountToSet);

        // производим проверку:
        assertEquals(defaultStationsCount, service.getStationsCount());
        assertEquals(initialCurrentStation, service.getStation());
        assertEquals(initialVolumeLevel, service.getVolume());
    }
}
