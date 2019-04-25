public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 20;
        int secondNumder = 10;
        char sign = '+';
        int result;

        if (sign == '+') {
            System.out.println(firstNumber + secondNumder);
        } else if (sign == '-') {
            System.out.println(firstNumber - secondNumder);
        } else if (sign == '*') {
            System.out.println(firstNumber * secondNumder);
        } else if (sign == '/' && secondNumder != 0) {
            System.out.println(firstNumber / secondNumder);
        } else if (sign == '%' && secondNumder != 0) {
            System.out.println(firstNumber % secondNumder);
        } else if (sign == '^') {
            result = 1;
            for (int i = 1; i <= secondNumder; i++) {
                result = result * firstNumber;
                System.out.println(result);
            }
        }
    }
}
