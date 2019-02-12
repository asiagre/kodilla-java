public class UserInterface {
    InputData inputData = new InputData();

    public static void getPlayerName() {
        System.out.println("What's your name?");
    }

    public static void getAmountOfWinsGames() {
        System.out.println("How many games has to reach to end game?");
    }
    public static void mainMenu() {
        System.out.println("Press: ");
        System.out.println("1 for rock");
        System.out.println("2 for paper");
        System.out.println("3 for scissors");
        System.out.println("\"x\" if you want to end game");
        System.out.println("\"n\" if you want to restart the game");
        System.out.println();
        System.out.println("Choose your move: ");
    }

    public static void chosenElement(Player user) {
        System.out.print("You have chosen ");
        if(user.getMove() == 1) {
            System.out.println("rock.");
        } else if(user.getMove() == 2) {
            System.out.println("paper.");
        } else if(user.getMove() == 3) {
            System.out.println("scissors.");
        }
    }

    public static void winning(Player user, Player computer) {
        chosenElement(user);
        System.out.println("You win!");
        System.out.println("Current result: " + user.getName() + " : computer : " + user.getScore() + " : " + computer.getScore() + ".");
    }

    public static void loosing(Player user, Player computer) {
        chosenElement(user);
        System.out.println("You lost :(");
        System.out.println("Current result: " + user.getName() + " : computer : " + user.getScore() + " : " + computer.getScore() + ".");
    }

    public static void draw(Player user, Player computer) {
        chosenElement(user);
        System.out.println("It is a draw.");
        System.out.println("Current result: " + user.getName() + " : computer " + user.getScore() + " : " + computer.getScore() + ".");
    }

    public static void endOfGame() {
        System.out.println();
    }

    public static void confirmExitOfGame() {
        System.out.println("Do you want to end this game? Press y/n");
    }

    public static void confirmNewGame() {
        System.out.println("Do you want to end this game and start a new one? Press y/n");
    }
}
