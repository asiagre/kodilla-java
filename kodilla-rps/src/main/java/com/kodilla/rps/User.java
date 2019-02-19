package com.kodilla.rps;

import com.kodilla.rps.Player;

public class User extends Player {
    private int move;

    public User(String name) {
        super(name);
    }


    public int getMove() {
        return InputData.getMove();
    }
}
