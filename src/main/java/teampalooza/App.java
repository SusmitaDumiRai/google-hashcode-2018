package teampalooza;

public class App {

    public static void main(String[] args) {
        CityMap cityMap = new CityMap();
        cityMap.loadMapFromFile("e_high_bonus.in");

        Simulation simulation = new Simulation(cityMap);
        long startTime = System.currentTimeMillis();
        simulation.start();
        long endTime = System.currentTimeMillis();

        System.out.println("Overall run time :" + (endTime - startTime));

        simulation.printOutput();
    }






}
