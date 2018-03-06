import java.lang.reflect.Array;
import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Passenger> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<>();
    }


    public void addPassenger(Passenger passenger1) {
        this.queue.add(passenger1);
    }

    public int queueLength() {
        return this.queue.size();
    }

    public Passenger removePassenger() {
        return this.queue.remove(0);
    }
}