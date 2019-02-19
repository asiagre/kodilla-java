package com.kodilla.rps;

import com.kodilla.rps.Player;

public class GameProcess {

    private static final int[][] TABLE = {
            { 0, 1, -1},
            { -1, 0, 1},
            { 1, -1, 0}
    };
    private final Player player1;
    private final Player player2;
    private int amountOfRequiredWins;


    public GameProcess(Player player1, Player player2, int amountOfRequiredWins) {
        this.player1 = player1;
        this.player2 = player2;
        this.amountOfRequiredWins = amountOfRequiredWins;
    }

    public void game() {
        boolean end = false;
        while(!end) {
            gameTour();
            if(player1.getScore() >= amountOfRequiredWins || player2.getScore() >= amountOfRequiredWins) {
                end = true;
            }
        }
    }

    public void gameTour() {
        int player1Move, player2Move;
        UserInterface.mainMenu();
        if(player1 instanceof User) {
            InputData.establishedAMove();
        }
        player1Move = player1.getMove();
        if(player2 instanceof User) {
            InputData.establishedAMove();
        }
        player2Move = player2.getMove();
        int result = getResult(player1Move, player2Move);
        addPlayersPoints(result);


//        if(pla == 5) {
//            UserInterface.confirmExitOfGame();
//            boolean confirmation = InputData.getConfirmation();
//            if(!confirmation) {
//                System.out.println("Continue the game");
//                gameTour(player1, player2);
//            } else {
//                return;
//            }
//        } else if(move == 4) {
//            UserInterface.confirmNewGame();
//            boolean confirmation = InputData.getConfirmation();
//            if(!confirmation) {
//                System.out.println("Continue the game");
//                gameTour(player1, computer);
//            } else {
//                computer.resetScore();
//                player1.resetScore();
//                gameTour(player1, computer);
//            }
//        } else if(move == 1 || move == 2 || move == 3){
//            int result = getResult(player1, player2);
//            if(result == -1) {
//                computer.addPoint();
//                UserInterface.loosing(player1, computer);
//            } else if(result == 0) {
//                UserInterface.draw(player1, computer);
//            } else if(result == 1) {
//                player1.addPoint();
//                UserInterface.winning(player1, computer);
//            }
//        } else {
//            System.out.println("Wrong data. Try again.");
//            gameTour(player1, computer);
//        }
    }

//    public static void endingGame(r) {
//        UserInterface.endOfGame(player1, computer);
//        InputData.makeAMove();
//        int move = player1.getMove();
//        if(move == 5) {
//            UserInterface.confirmExitOfGame();
//            boolean confirmation = InputData.getConfirmation();
//            if(!confirmation) {
//                endingGame(player1, computer);
//            } else {
//                return;
//            }
//        } else if(move == 4) {
//            UserInterface.confirmNewGame();
//            boolean confirmation = InputData.getConfirmation();
//            if(!confirmation) {
//                endingGame(player1, computer);
//            } else {
//                computer.resetScore();
//                player1.resetScore();
//                gameTour(player1, computer);
//            }
//        } else {
//            System.out.println("Wrong data. Try again.");
//            endingGame(player1, computer);
//        }
//    }

    public int getResult(int player1Move, int player2Move) {

        int result = TABLE[player1Move][player2Move];

        return result;
    }

    private void addPlayersPoints(int result) {
        if(result == -1) {
            player2.addPoint();
            UserInterface.winningPlayer2(player1, player2);
        } else if(result == 0) {
            UserInterface.draw(player1, player2);
        } else if(result == 1) {
            player1.addPoint();
            UserInterface.winningPlayer1(player1, player2);
        }
    }

}
