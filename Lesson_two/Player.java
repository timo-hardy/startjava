public class Player {

    private String name;
    private int number;
    public static int counter;

    public Player(String name, int number) {
        this.name = name;
        this.number = number;
        counter++;
        System.out.println(++counter);
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
