package com.kodilla.rps;

public class RpsRunner {

    public static void main(String[] args) {

        UserInterface.getNumbersOfPlayers();
        int numbersOfPlayers = InputData.getAmountOfPlayers();

        if(numbersOfPlayers == 0) {
            UserInterface.getAmountOfWinsGames();
            int amountOfRequiredWins = InputData.getAmountOfRequiredWins();
            Player computer1 = new Computer("Computer1");
            Player computer2 = new Computer("Computer2");
            GameProcess gameProcess = new GameProcess(computer1, computer2, amountOfRequiredWins);
            gameProcess.game();
            if(computer1.getScore() > computer2.getScore()) {
                UserInterface.wins(computer1);
            } else {
                UserInterface.wins(computer2);
            }
        } else if(numbersOfPlayers == 1) {
            UserInterface.getPlayerName();
            String name = InputData.getName();
            UserInterface.getAmountOfWinsGames();
            int amountOfRequiredWins = InputData.getAmountOfRequiredWins();
            Player user = new User(name);
            Player computer = new Computer("Computer");
            GameProcess gameProcess = new GameProcess(user, computer, amountOfRequiredWins);
            gameProcess.game();
            if(user.getScore() > computer.getScore()) {
                UserInterface.wins(user);
            } else {
                UserInterface.wins(computer);
            }
        } else {
            UserInterface.getPlayerName();
            String name = InputData.getName();
            UserInterface.getSecondName();
            String name2 = InputData.getName();
            UserInterface.getAmountOfWinsGames();
            int amountOfRequiredWins = InputData.getAmountOfRequiredWins();

            Player user1 = new User(name);
            Player user2 = new User(name2);
            GameProcess gameProcess = new GameProcess(user1, user2, amountOfRequiredWins);
            gameProcess.game();
            if(user1.getScore() > user2.getScore()) {
                UserInterface.wins(user1);
            } else {
                UserInterface.wins(user2);
            }
        }

    }
}
