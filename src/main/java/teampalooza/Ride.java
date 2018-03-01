package teampalooza;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ride {
    private int startX;
    private int startY;
    private int destinationX;
    private int destinationY;
    private int earliestStartStep;
    private int latestFinishStep;
    private boolean assigned;
    private boolean completed;

}
