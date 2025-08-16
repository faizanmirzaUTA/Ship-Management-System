public class CruiseShip extends Ship {
    private int passengers;

    // Constructor
    public CruiseShip(String name, String yearBuilt, int passengers) {
        super(name, yearBuilt);
        this.passengers = passengers;
    }

    // Copy Constructor
    public CruiseShip(CruiseShip other) {
        super(other.getName(), other.getYearBuilt());
        this.passengers = other.passengers;
    }

    // Accessor (Getter)
    public int getPassengers() {
        return passengers;
    }

    // Mutator (Setter)
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Cruise Ship Name: " + getName() + ", Passengers: " + passengers;
    }

    // Override display method
    @Override
    public void display() {
        System.out.println(toString());
    }
}
