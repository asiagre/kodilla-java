import java.util.Scanner;

public class InputData {

    Scanner scan = new Scanner();

    public static String getName() {
        String name = scan.nextLine();
        return name;
    }

    public static int getAmountOfWins() {
        int amountOfWins = scan.nextInt();
        return amountOfWins;
    }

    public static String getMove() {
        String move = scan.nextLine();
        return move;
    }
}
