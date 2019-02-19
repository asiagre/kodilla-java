package com.kodilla.rps;

import java.util.Random;

public class Computer extends Player {
    private Random generator = new Random();

    public Computer(String name) {
        super(name);
    }

    public int getMove() {
        return generator.nextInt(3);
    }
}
