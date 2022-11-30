import java.util.HashMap;
import java.util.Map;

public class Ladder {
    private Map<Integer, Integer> ladderPosition;

    public Ladder() {
        ladderPosition = new HashMap<>();
    }

    public void setLadderPosition(int startPosition, int endPosition) {
        ladderPosition.put(startPosition, endPosition);
    }

    public int getLadderPosition(int startPosition) {
        return ladderPosition.get(startPosition);
    }

    public boolean checkLadderPosition(int startPosition) {
        return ladderPosition.containsKey(startPosition);
    }

}
