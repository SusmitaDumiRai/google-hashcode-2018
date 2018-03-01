package teampalooza;

import lombok.Data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Data
public class CityMap {
    private int[][] grid;
    private List<Ride> rideList = new ArrayList<>();

    private int vehicleAmount;
    private int rideAmount;
    private int bonuspoints;
    private int steps;

    public void loadMapFromFile(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

            boolean firstLine = true;
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                if (firstLine) {
                    String[] mapInfo = currentLine.split(" ");
                    this.grid = new int[Integer.parseInt(mapInfo[0])][Integer.parseInt(mapInfo[1])];
                    this.vehicleAmount = Integer.parseInt(mapInfo[2]);
                    this.rideAmount = Integer.parseInt(mapInfo[3]);
                    this.bonuspoints = Integer.parseInt(mapInfo[4]);
                    this.steps = Integer.parseInt(mapInfo[5]);
                    firstLine = false;
                } else {
                    String[] rideInfo = currentLine.split(" ");
                    Ride ride = new Ride(Integer.parseInt(rideInfo[0]), Integer.parseInt(rideInfo[1]),
                            Integer.parseInt(rideInfo[2]), Integer.parseInt(rideInfo[3]), Integer.parseInt(rideInfo[4]),
                            Integer.parseInt(rideInfo[5]), false);
                    this.rideList.add(ride);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
