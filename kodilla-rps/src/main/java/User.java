public class User extends Player {
    private String name;

    public User(String name) {
        super(name);
    }


    public int getMove() {
        String move = InputData.getAMove();
        int result;
        if (move.equals("1") || move.equals("2") || move.equals("3")) {
            result = Integer.parseInt(move);
        } else if (move.equalsIgnoreCase("n")) {
            result = 4;
        } else if(move.equalsIgnoreCase("x")){
            result = 5;
        } else  {
            result = 0;
        }
        return result;
    }
}
