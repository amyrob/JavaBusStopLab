import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop usherHall;
    private Passenger passenger1;

    @Before
    public void before() {
        this.usherHall = new BusStop("Usher Hall");
        this.passenger1 = new Passenger();
    }

    @Test
    public void canAddPassengerToQueue() {
        this.usherHall.addPassenger(passenger1);
        assertEquals(1, usherHall.queueLength());
    }

    @Test
    public void canRemovePassengerFromQueue() {
        this.usherHall.addPassenger(passenger1);
        this.usherHall.removePassenger();
        assertEquals(0, usherHall.queueLength());
    }
}
