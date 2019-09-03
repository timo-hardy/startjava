import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Калькулятор запущен!");

		System.out.print("Введите первое число: ");
		int firstNumber = scanner.nextInt();

		System.out.print("Введите знак математической операции");
		String symbol = scanner.next();
		char mathOperation = symbol.charAt(0);
	}
}
