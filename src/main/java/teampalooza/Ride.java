package teampalooza;

import lombok.Data;

@Data
class Ride {
    private int startX;
    private int startY;
    private int destinationX;
    private int destinationY;
    private int earliestStartStep;
    private int latestFinishStep;
    private boolean assigned;
    private boolean completed;
    private int actualId;
    static int id = -1;

    Ride(int startX, int startY, int destinationX, int destinationY, int earliestStartStep, int latestFinishStep, boolean assigned, boolean completed) {
        this.startX = startX;
        this.startY = startY;
        this.destinationX = destinationX;
        this.destinationY = destinationY;
        this.earliestStartStep = earliestStartStep;
        this.latestFinishStep = latestFinishStep;
        this.assigned = assigned;
        this.completed = completed;


        id++;
        this.actualId = id;
    }
}
