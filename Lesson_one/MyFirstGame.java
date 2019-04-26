public class MyFirstGame {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 14) {
            if (number < 14) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                System.out.println("Вы угадали!");
            }
            number++;
        }
    }
}
