
public class Application {

    public static void main(String[] args) {

        UserInterface.getPlayerName();
        String name = InputData.getName();
        UserInterface.getAmountOfWinsGames();;
        int amountOfRequiredWins = InputData.getAmountOfRequiredWins();

        User user = new User(name);
        Computer computer = new Computer();

        GameProcess.gameTour(user, computer);
    }
}
