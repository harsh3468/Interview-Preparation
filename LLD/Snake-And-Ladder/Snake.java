import java.util.HashMap;
import java.util.Map;

public class Snake {
    private Map<Integer, Integer> snakePosition;

    public Snake() {
        snakePosition = new HashMap<>();
    }

    public void setSnakePosition(int startPosition, int endPosition) {
        snakePosition.put(startPosition, endPosition);
    }

    public int getSnakePosition(int startPosition) {
        return snakePosition.get(startPosition);
    }

    public boolean checkSnakePosition(int startPosition) {
        return snakePosition.containsKey(startPosition);
    }

}
