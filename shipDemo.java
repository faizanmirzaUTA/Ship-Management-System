import java.util.ArrayList;

public class shipDemo {
    public static void main(String[] args) {
        // Creating Ship array with polymorphic behavior
        Ship[] ships = new Ship[4];
        ships[0] = new CruiseShip("Oceanic", "1998", 2000);
        ships[1] = new CargoShip("Titan", "2010", 50000);
        ships[2] = new CruiseShip("Voyager", "2005", 3000);
        ships[3] = new CargoShip("Hercules", "2015", 60000);

        // Displaying ship information using polymorphism
        System.out.println("Displaying Ship Array:");
        for (Ship ship : ships) {
            ship.display();
        }

        // Using an ArrayList to store Ship objects
        ArrayList<Ship> shipList = new ArrayList<>();
        shipList.add(new CruiseShip("Majestic", "2000", 2500));
        shipList.add(new CargoShip("Colossus", "2018", 70000));

        // Testing Copy Constructors
        CruiseShip copyCruiseShip = new CruiseShip((CruiseShip) ships[0]);
        CargoShip copyCargoShip = new CargoShip((CargoShip) ships[1]);

        shipList.add(copyCruiseShip);
        shipList.add(copyCargoShip);

        // Displaying ship information using ArrayList and toString()
        System.out.println("\nDisplaying Ship ArrayList:");
        for (Ship ship : shipList) {
            System.out.println(ship.toString());
        }
    }
}
