import java.lang.Math;

public class GuessNumber {

    private int randomNumber;
    private int tries = 0;

    public int generateRandomNumber(int min, int max) {
        min = 0;
        max = 100;
        return min + (int)(Math.random() * ((max - min) + 1)); // Method to generate a random number in range [0 ; 100]
    }

    public boolean guess(int guess) {
        tries++;
        if (guess == generateRandomNumber) {
            if (tries > 1) {
                System.out.println("You got the number in " + tries + " tries.");
            } else {
                System.out.println("You got the number in " + tries + " try.");
            }
            return true;
        } else if (guess > generateRandomNumber) {
            System.out.println("Too high try again");
        } else {
            System.out.println("Too low try again");
        }
        return false;
    }

    // public void reset() {
    //     this.tries = 0;
    //     generateRandomNumber();
    // }
}
