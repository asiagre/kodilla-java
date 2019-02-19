package com.kodilla.rps;

import java.util.Scanner;

public class InputData {

    private static Scanner scan = new Scanner(System.in);
    private static int result = 0;

    public static int getAmountOfPlayers() {
        boolean isCorrect = false;
        int result = 1;
        do {
            String numberOfPlayers = scan.nextLine();
            if(numberOfPlayers != null && !numberOfPlayers.isEmpty() && (numberOfPlayers.equals("0") || numberOfPlayers.equals("1") || numberOfPlayers.equals("2"))) {
                isCorrect = true;
                result = Integer.parseInt(numberOfPlayers);
            }
        } while(!isCorrect);
        return result;
    }

    public static String getName() {
        String name = scan.nextLine();
        return name;
    }

    public static int getAmountOfRequiredWins() {
        int amountOfRequiredWins = scan.nextInt();
        return amountOfRequiredWins;
    }

    public static void establishedAMove() {
        boolean isCorrect = false;
        do {
            String move = scan.nextLine();
            if(move != null && !move.isEmpty() && (move.equals("1") || move.equals("2") || move.equals("3"))) {
                isCorrect = true;
                result = Integer.parseInt(move) - 1;
            }
        } while(!isCorrect);

//        } else if (move.equalsIgnoreCase("n")) {
//            result = 4;
//        } else if(move.equalsIgnoreCase("x")){
//            result = 5;
//        } else  {
//            result = 6;
    }

    public static int getMove() {
        return result;
    }

    public static boolean getConfirmation() {
        String confirmation = scan.nextLine();
        return confirmation.equalsIgnoreCase("y");
    }
}

