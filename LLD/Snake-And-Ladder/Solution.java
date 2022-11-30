import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] arg) {
        System.out.println(".......Snake And Ladder Game......\nInitializing Snake And Ladder Board------>");
        GameBoard gameBoard = new GameBoard(10, 10, 2);
        Snake snakePositionMap = new Snake();
        Ladder ladderPositionMap = new Ladder();

        /* PLAYERS DECLERATION */
        Player player1 = new Player("Player1", 1);
        Player player2 = new Player("Player2", 2);
        gameBoard.setGameTurn(player1);
        gameBoard.setGameTurn(player2);

        /* SNAKE POSITION DECLERATION */
        snakePositionMap.setSnakePosition(20, 7);
        snakePositionMap.setSnakePosition(30, 10);
        snakePositionMap.setSnakePosition(80, 14);
        snakePositionMap.setSnakePosition(92, 1);
        snakePositionMap.setSnakePosition(50, 40);

        /* LADDER POSITION DECLERATION */
        ladderPositionMap.setLadderPosition(10, 82);
        ladderPositionMap.setLadderPosition(60, 75);
        ladderPositionMap.setLadderPosition(90, 94);
        ladderPositionMap.setLadderPosition(25, 88);
        ladderPositionMap.setLadderPosition(45, 65);
        System.out.println("Game Is Going To Start.....>");
        gameBoard.startTheGame(snakePositionMap, ladderPositionMap);
        System.out.println("The End -_-");
    }
}