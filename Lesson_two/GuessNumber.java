import java.util.Random;

public class GuessNumber {

    private int randomNumber;
    private int tries = 0;
    private int range;

    public GuessNumber(int range) {

    }

    public void generateRandomNumber() {
        int min = 0;
        int max = 100;
        int difference = max - min;
        Random random = new Random();
        int randomNumber = random.nextInt(difference + 1);
        randomNumber += min;
    }

    public boolean guees(int guess) {
        tries++;
        if(guess == randomNumber) {
            if (tries > 1) {

            }
        }
    }
}
