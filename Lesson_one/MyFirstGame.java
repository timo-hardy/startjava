public class MyFirstGame {
    public static void main(String[] args) {
        int computerNumber = 33;
        int playerNumber = 16;

        while (playerNumber != computerNumber) {
            if (playerNumber < computerNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                playerNumber++;
            } else if (playerNumber > computerNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                playerNumber--;
            }
        }
        System.out.println("Вы угадали!");
    }
}
