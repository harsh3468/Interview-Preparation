import java.util.LinkedList;
import java.util.Queue;

public class GameBoard {
    private int height;
    private int width;
    private int dice;
    private int board;
    Queue<Player> gameTurn = new LinkedList<>();

    public GameBoard(int width, int height, int dice) {
        this.width = width;
        this.height = height;
        this.dice = dice;
        board = width * height;
    }

    public int getBoard() {
        return board;
    }

    public int getDice() {
        return dice;
    }

    public void setGameTurn(Player gamePlayer) {
        gameTurn.offer(gamePlayer);
    }

    public void getGameTurn() {
        gameTurn.poll();
    }

    private int rollDice() {
        int max = dice * 6;
        int min = dice * 1;
        int range = max - min + 1;
        int diceTotal = (int) (Math.random() * range) + min;
        return diceTotal;
    }

    public void startTheGame(Snake snakePositionMap, Ladder ladderPositionMap) {
        while (gameTurn.size() > 1) {
            Player gamePlayer = gameTurn.poll();
            int rollOutcome = rollDice();
            int playerPosition = gamePlayer.getPosition();
            int calculatedPosition = playerPosition + rollOutcome;

            if (calculatedPosition > board) {
                setGameTurn(gamePlayer);
                System.out.println("Oops You Miss The Winning Chance-> " + calculatedPosition);
            } else if (playerPosition + rollOutcome == board) {
                System.out.println("Winner Winner Chicken Dinner-> " + gamePlayer.getPlayerName());
            } else {
                if (snakePositionMap.checkSnakePosition(calculatedPosition)) {
                    gamePlayer.setPosition(snakePositionMap.getSnakePosition(calculatedPosition));
                    setGameTurn(gamePlayer);
                    System.out.println(gamePlayer.getPlayerName() + " :Oops Snake Has Bitten You. New Position Is->"
                            + gamePlayer.getPosition());
                } else if (ladderPositionMap.checkLadderPosition(calculatedPosition)) {
                    gamePlayer.setPosition(ladderPositionMap.getLadderPosition(calculatedPosition));
                    setGameTurn(gamePlayer);
                    System.out.println(
                            gamePlayer.getPlayerName() + " :Wow You Have Achieved The New Position. New Position Is-> "
                                    + gamePlayer.getPosition());
                } else {
                    gamePlayer.setPosition(calculatedPosition);
                    setGameTurn(gamePlayer);
                    System.out.println(gamePlayer.getPlayerName()
                            + ": Your New Position Is-> " + gamePlayer.getPosition());
                }
            }

        }
    }
}
