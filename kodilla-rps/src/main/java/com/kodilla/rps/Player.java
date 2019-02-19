package com.kodilla.rps;

public abstract class Player {

    private final String name;
    private int score = 0;

    public Player(String name) {

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {

        return score;
    }

    public int addPoint() {
        return this.score++;
    }

    public void resetScore() {
        score = 0;
    }

    public abstract int getMove();
}
