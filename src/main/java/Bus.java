import java.util.ArrayList;

public class Bus {

    private String destination;
    private ArrayList<Passenger> commuters;
    private int capacity;

    public Bus(String destination) {
        this.destination = destination;
        this.commuters = new ArrayList<>();
        this.capacity = 5;
    }

    public int passengerCount() {
        return commuters.size();
    }

    public boolean addPassenger(Passenger passenger) {
        if (this.passengerCount() < this.capacity) {
            this.commuters.add(passenger);
        return true;}
        else {
            return false;}
    }

    public void removePassenger() {
       if  (this.passengerCount() > 0) {
           this.commuters.remove(0);}
    }

    public void pickUpFromQueue(BusStop libertonBrae) {
        this.commuters.add(libertonBrae.removePassenger());
    }
}
