public class Player {
    private String playerName;
    private int id;
    private int position;

    public Player(String playerName, int id) {
        this.playerName = playerName;
        this.id = id;
        this.position = 1;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getId() {
        return id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
