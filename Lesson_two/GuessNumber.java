import java.lang.Math;

public class GuessNumber {

    public int getRandomNumber(int min, int max) {
        min = 0;
        max = 100;
        return min + (int)(Math.random() * ((max - min) + 1)); // Method to generate a random number in range [0 ; 100]
    }


}
