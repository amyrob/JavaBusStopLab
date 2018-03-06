import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus47;
    private  Passenger passenger1;
    private  Passenger passenger2;
    private  Passenger passenger3;
    private  Passenger passenger4;
    private  Passenger passenger5;
    private  Passenger passenger6;
    private  BusStop   libertonBrae;

    @Before
    public void before() {
        bus47 = new Bus("Crammond");
        passenger1 = new Passenger();
        passenger2 = new Passenger();
        passenger3 = new Passenger();
        passenger4 = new Passenger();
        passenger5 = new Passenger();
        passenger6 = new Passenger();
        libertonBrae = new BusStop("Liberton Brae");
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, this.bus47.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        bus47.addPassenger(passenger1);
        assertEquals(1, bus47.passengerCount());
    }

    @Test
    public void cantAddPassengerWhenFull() {
        bus47.addPassenger(passenger1);
        bus47.addPassenger(passenger2);
        bus47.addPassenger(passenger3);
        bus47.addPassenger(passenger4);
        bus47.addPassenger(passenger5);
        bus47.addPassenger(passenger6);
        assertEquals(5, bus47.passengerCount());
    }

    @Test
    public void canRemovePassenger() {
        bus47.addPassenger(passenger1);
        bus47.removePassenger();
        assertEquals(0, bus47.passengerCount());
    }

    @Test
    public void canPickUpFromQueue() {
        this.libertonBrae.addPassenger(passenger1);
        bus47.pickUpFromQueue(libertonBrae);
        assertEquals(1, bus47.passengerCount());
    }
}
