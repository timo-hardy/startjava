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

    public void calculate() {
        switch(mathOperarion) {
            case '+':
                System.out.println(firstNumber + secondNumder);
                break;
            case '-':
                System.out.println(firstNumber - secondNumder);
                break;
            case '*':
                System.out.println(firstNumber * secondNumder);
                break;
            case '/':
                System.out.println(firstNumber / secondNumder);
                break;
            case '%':
                System.out.println(firstNumber % secondNumder);
                break;
            case '^':
            pow();
            break;
            default:
                System.out.println("Error");
        }
    }

    private void pow() {
                     int result = 1;
            for (int i = 1; i <= secondNumder; i++) {
                result *= firstNumber;
            }
            System.out.println(result);
    }
}
