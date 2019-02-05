public class UserInterface {

    public static void introduction() {
        System.out.println("what's your name?");
        InputData.getName();
        System.out.println("How many games has to reach to end game?");
        InputData.getAmountOfWins();
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

    public static void afterMakingChoice(int choice, boolean win) {
        System.out.print("You have chosen ");
        if(choice == 0) {
            System.out.println("rock.");
        } else if(choice == 1) {
            System.out.println("paper.");
        } else if(choice == 2) {
            System.out.println("scissors.");
        }
        System.out.print("You " + );
        if(win) {
            System.out.print("win. ");
        } else {
            System.out.print("lose. ")
        }
        System.out.println("Current result: " + user.getName() + " : computer : " + user.getScore() + " : " + computer.getScore() + ".");
    }

    public static void endOfGame() {

    }

    public static void confirmExitOfGame() {

    }

    public static void conformNewGame() {

    }
}
