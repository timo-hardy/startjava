public class Calculator {

    private int firstNumber;
    private int secondNumder;
    private char mathOperarion;

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumder) {
        this.secondNumder = secondNumder;
    }

    public void setMathOperation(char mathOperarion) {
        this.mathOperarion = mathOperarion;
    }

    public void calclulate() {

    }

        int firstNumber = 2;
        int secondNumder = 10;
        char sign = '^';

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
            // if (secondNumder == 0) {
            //     System.out.println(1);
            // }
           int result = 1;
            for (int i = 1; i <= secondNumder; i++) {
                result *= firstNumber;
            }
            System.out.println(result);
        }

}
