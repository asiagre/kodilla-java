import java.util.Random;

public class Computer extends Player{
    private String name = "Computer";

    public Computer() {
        super();
    }

    public String getName() {
        return "Computer";
    }

    public int move() {
        Random generator = new Random();

        return generator.nextInt(3);
    }
}
