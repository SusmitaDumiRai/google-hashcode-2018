package teampalooza;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Car {
    private int currentLocationX;
    private int currentLocationY;
    private Ride currentRide;
    private int amountOfRides;
    private boolean occupied = false;
    private int journeyTime;

    public int pickUp() {

        int result = ((Math.abs(this.currentLocationX - this.currentRide.getStartX()))
                + (Math.abs(this.currentLocationY - this.currentRide.getStartY())));
        this.currentLocationX = this.currentRide.getStartX();
        this.currentLocationY = this.currentRide.getStartY();
        return result;
    }

    public int dropOff() {
        int result = ((Math.abs(this.currentLocationX - this.currentRide.getDestinationX()))
                + (Math.abs(this.currentLocationY - this.currentRide.getDestinationY())));
        this.currentLocationX = this.currentRide.getDestinationX();
        this.currentLocationY = this.currentRide.getDestinationY();
        return result;
    }

    public void setAmountOfRides() {
        this.amountOfRides += 1;
    }

    public void setJourneyTime() {
        this.journeyTime -= 1;
    }

    public void setCurrentRide(Ride currentRide) {
        this.currentRide = currentRide;
        this.journeyTime = pickUp() + dropOff();
    }
}
