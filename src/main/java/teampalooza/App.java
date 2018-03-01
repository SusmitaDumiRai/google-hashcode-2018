package teampalooza;

public class App {

    public static void main(String[] args) {
        CityMap cityMap = new CityMap();
        cityMap.loadMapFromFile("a_example.in");

        Simulation simulation = new Simulation(cityMap);
        simulation.start();

        simulation.printOutput();
    }


}
