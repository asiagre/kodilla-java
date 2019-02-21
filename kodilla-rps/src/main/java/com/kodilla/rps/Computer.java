package com.kodilla.rps;

import java.util.Random;

public class Computer extends Player {
    private Random generator = new Random();
    private int move;

    public Computer(String name) {
        super(name);
    }

    public void establishedMove() {
        move = generator.nextInt(3);
    }

    public int getMove() {
        return move;
    }
}
