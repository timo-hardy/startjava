import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();

		System.out.println("Калькулятор запущен!");

		String answer = "Да";
		while(answer.equals("Да")) {
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

			do {
				System.out.print("Хотите продолжить? [Да/Нет]: ");
				answer = scanner.next();
			} while(!answer.equals("Да") && !answer.equals("Нет"));
		}

		System.out.println("Калькулятор закрылся!");
	}
}
