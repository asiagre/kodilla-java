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

    public String getName() {
        return this.name;
    }

    public int getScore() {

        return score;
    }

    public int addPoint() {

        return score++;
    }

    public abstract int getMove();
}
