public class GameProcess {

    public static void gameTour(User user, Computer computer) {
        UserInterface.mainMenu();
        InputData.makeAMove();
        int move = user.getMove();
        if(move == 5) {
            UserInterface.confirmExitOfGame();
            boolean confirmation = InputData.getConfirmation();
            if(!confirmation) {
                System.out.println("Continue the game");
                gameTour(user, computer);
            }
        } else if(move == 4) {
            UserInterface.confirmNewGame();
            boolean confirmation = InputData.getConfirmation();
            if(!confirmation) {
                System.out.println("Continue the game");
                gameTour(user, computer);
            } else {
                gameTour(user, computer);
            }
        } else if(move == 1 || move == 2 || move == 3){
            int result = getResult(user, computer);
            if(result == -1) {
                UserInterface.loosing(user, computer);
                computer.addPoint();
            } else if(result == 0) {
                UserInterface.draw(user, computer);
            } else if(result == 1) {
                UserInterface.winning(user, computer);
                user.addPoint();
            }
        } else {
            System.out.println("Wrong data. Try again.");
            gameTour(user, computer);
        }
    }

    public static int getResult(Player user, Computer computer) {
        int[][] table = {
                { 0, 1, -1},
                { -1, 0, 1},
                { 1, -1, 0}
        };
        int playerMove = user.getMove();
        int computerMove = computer.getMove();

        int result = table[playerMove - 1][computerMove];

        return result;
    }

}
