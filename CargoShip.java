public class CargoShip extends Ship {
    private int tonnage;

    // Constructor
    public CargoShip(String name, String yearBuilt, int tonnage) {
        super(name, yearBuilt);
        this.tonnage = tonnage;
    }

    // Copy Constructor
    public CargoShip(CargoShip other) {
        super(other.getName(), other.getYearBuilt());
        this.tonnage = other.tonnage;
    }

    // Accessor (Getter)
    public int getTonnage() {
        return tonnage;
    }

    // Mutator (Setter)
    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Cargo Ship Name: " + getName() + ", Tonnage: " + tonnage + " tons";
    }

    // Override display method
    @Override
    public void display() {
        System.out.println(toString());
    }
}
