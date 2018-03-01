package teampalooza;

public class Simulation {
    private CityMap cityMap;

    public Simulation(CityMap cityMap) {
        this.cityMap = cityMap;
    }

    public void start() {
        for (int i = 0; i < cityMap.getSteps(); i++) {
            assignRides();
            for (Car c : this.cityMap.getCarList()) {
                if (i >= c.getCurrentRide().getEarliestStartStep()) {
                    if (c.getJourneyTime() != 0) {
                        c.setJourneyTime();
                    } else {
                        c.setOccupied(false);
                        c.getCurrentRide().setCompleted(true);
                    }
                }
            }
            assignRides();
        }
    }

    private void assignRides() {
        for (Car c : this.cityMap.getCarList()) {
            for (Ride r : this.cityMap.getRideList()) {
                if (!r.isAssigned() && !c.isOccupied()) {
                    c.setCurrentRide(r);
                    c.setAmountOfRides();
                    r.setAssigned(true);
                    c.setOccupied(true);
                    c.getIdsOfRides().add(r.getActualId());
                }
            }
        }
    }

    public void printOutput() {
        for (Car c : this.cityMap.getCarList()) {
            StringBuilder a = new StringBuilder(c.getAmountOfRides() + "");
            for(Integer i : c.getIdsOfRides()) {
                a.append(" ").append(i);
            }
            System.out.println(a);
        }
    }
}
