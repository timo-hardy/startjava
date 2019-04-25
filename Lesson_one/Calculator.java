public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 20;
        int secondNumder = 10;
        int result;

        //Умножение
        result = firstNumber * secondNumder;
        if(firstNumber > 0 && secondNumder > 0) {
            System.out.println("Multiplication = " + result);
        }

        //Вычетание
        result = firstNumber - secondNumder;
        if (firstNumber > 0 && secondNumder > 0) {
            System.out.println("Subtraction = " + result);
        }

        //Сложение
        result = firstNumber + secondNumder;
        if (firstNumber > 0 && secondNumder > 0) {
            System.out.println("Addition = " + result);
        }

        //Деление
        result = firstNumber / secondNumder;
        if (firstNumber >= 0 && secondNumder != 0) {
            System.out.println("Division = " + result);
        }

        //Деление по модулю
        result = firstNumber % secondNumder;
        if (firstNumber >= 0 && secondNumder != 0) {
            System.out.println("Remainder of the division = " + result);
        }

        //Возведение в степень
        result = 1;
        for (int i = 1; i <= secondNumder; i++) {
            result = result * firstNumber;
            System.out.println(result);
        }
    }
}
