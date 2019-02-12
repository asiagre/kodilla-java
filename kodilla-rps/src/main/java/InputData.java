import java.util.Scanner;

public class InputData {

    private static Scanner scan = new Scanner(System.in);
    private static String move;

    public static String getName() {
        String name = scan.nextLine();
        return name;
    }

    public static int getAmountOfRequiredWins() {
        int amountOfRequiredWins = scan.nextInt();
        return amountOfRequiredWins;
    }

    public static void makeAMove() {
        move = scan.nextLine();
    }

    public static String getAMove() {
        return move;
    }

    public static boolean getConfirmation() {
        String confirmation = scan.nextLine();
        if(confirmation.equalsIgnoreCase("y")) {
            return true;
        } else return false;
    }
}
