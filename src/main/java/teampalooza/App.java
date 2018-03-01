package teampalooza;

public class App {

    public static void main(String[] args) {
        CityMap cityMap = new CityMap();
        cityMap.loadMapFromFile("b_should_be_easy.in");

        Simulation simulation = new Simulation(cityMap);
        simulation.start();

        simulation.printOutput();
    }


}
