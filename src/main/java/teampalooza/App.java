package teampalooza;

public class App {

    public static void main(String[] args) {
        CityMap cityMap = new CityMap();
        cityMap.loadMapFromFile("a_example.in");
        cityMap.getRideList().forEach(System.out::println);
    }






}
