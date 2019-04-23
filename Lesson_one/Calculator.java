public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 20;
        int secondNumder = 10;

        //Умножение
        if(firstNumber > 0 && secondNumder > 0) {
            System.out.println("Positive result = " + (firstNumber * secondNumder));
        } else {
            System.out.println("Negative result = " + (firstNumber * secondNumder));
        }

        //Вычетание
        if (firstNumber > secondNumder && firstNumber > 0 && secondNumder > 0) {
            System.out.println("Positive result = " + (firstNumber - secondNumder));
        } else {
            System.out.println("Negative result = " + (firstNumber - secondNumder));
        }

        //Сложение
        if (firstNumber > secondNumder && firstNumber > secondNumder) {
            System.out.println("Positive result = " + (firstNumber + secondNumder));
        } else {
            System.out.println("Negative result = " + (firstNumber + secondNumder));
        }

        //Деление
        if (firstNumber >= 0 && secondNumder != 0) {
            System.out.println("Positive or zero = " + (firstNumber / secondNumder));
        } else if (secondNumder == 0) {
            System.out.println("It is impossible to divide by zero");
        }

        //Деление по модулю
        if (firstNumber >= 0 && secondNumder != 0) {
            System.out.println("remainder of the division = " + (firstNumber % secondNumder));
        } else if(secondNumder == 0) {
            System.out.println("It is impossible to divide by zero");
        }

        //Возведение в степень
        if (firstNumber >= 0) {
            System.out.println("Positive result of exponentiation or zero = " + (firstNumber * firstNumber));
        } else {
            System.out.println("Negative result of exponentiation = " + (firstNumber * firstNumber));
        }



    }
}
