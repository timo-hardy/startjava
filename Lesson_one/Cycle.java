public class Cycle {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i < 20; i++) {
            result = result + 1;
            System.out.println("result = " + result);
        }

        int j = 2;
        int result1 = 8;
        while (j <= 5) {
            result1 = result1 - j;
                System.out.println("While - " + result1);
            j++;
        }

        int k = 11;
        int sum = 0;
        do {
            sum = sum + k;
            k += 2;
        } while(k < 20);

        System.out.println("sum of odd numbers - " + sum);
    }
}
