import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player firstPlayer = new Player("Vasya", 23);
        Player secondPlayer = new Player("Petya", 84);
        GuessNumber guessNumber = new GuessNumber();

        System.out.println("Игра началась!");

        String answer = "Да";
        while(answer.equals("Да")){
            System.out.print("Первый игрок напишите ваше имя: ");
            String nameFirstPlayer = scanner.nextLine();
            firstPlayer.setName(nameFirstPlayer);

            System.out.print("Vasya напишите ваше число: ");
            int numberFirstPlayer = scanner.nextInt();
            firstPlayer.setNumber(numberFirstPlayer);

            System.out.print("Второй игрок напишите ваше имя: ");
            String nameSecondPlayer = scanner.nextLine();
            secondPlayer.setName(nameSecondPlayer);

            System.out.print("Petya напишите ваше число: ");
            int numberSecondPlayer = scanner.nextInt();
            secondPlayer.setNumber(numberSecondPlayer);

            guessNumber.guess();

            do {
                System.out.print("Хотите продолжить? [Да/Нет]: ");
                answer = scanner.next();
            } while(!answer.equals("Да") && !answer.equals("Нет"));

            System.out.println("Игра закончилась!");
        }
    }
}
