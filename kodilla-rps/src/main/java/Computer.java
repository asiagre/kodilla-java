import java.util.Random;

public class Computer extends Player{
    Random generator = new Random();
    private String name = "Computer";

    public Computer() {
        super();
    }

    public int getMove() {
        return generator.nextInt(3);
    }
}
