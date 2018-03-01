package teampalooza;

public class App {

    public static void main(String[] args) {
        CityMap cityMap = new CityMap();
        cityMap.loadMapFromFile("c_no_hurry.in");

        Simulation simulation = new Simulation(cityMap);
        simulation.start();

        simulation.printOutput();
    }


}
