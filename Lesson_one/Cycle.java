public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("result = " + i);
        }

        int result1 = 6;
        while (result1 >= -6) {
            System.out.println("While - " + result1);
            result1--;
        }

        int k = 10;
        int sum = 0;
        do {
            if(k % 2 != 0) {
                sum += k;
            }
            k++;
        } while(k < 20);

        System.out.println("sum of odd numbers - " + sum);
    }
}
