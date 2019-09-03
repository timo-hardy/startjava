import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();

		System.out.println("Калькулятор запущен!");

		System.out.print("Введите первое число: ");
		int firstNumber = scanner.nextInt();
		calculator.setFirstNumber(firstNumber);

		System.out.print("Введите знак математической операции: ");
		String symbol = scanner.next();
		char mathOperation = symbol.charAt(0);
		calculator.setMathOperation(mathOperation);

		System.out.print("Введите второе число: ");
		int secondNumber = scanner.nextInt();
		calculator.setSecondNumber(secondNumber);

		calculator.calculate();
	}
}
