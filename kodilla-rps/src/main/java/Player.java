public abstract class Player {

    String name;

    int score = 0;

    public Player() {};

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getName();

    public int getScore() {
        return score;
    }

    public int addPoint() {
        return score++;
    }
}
