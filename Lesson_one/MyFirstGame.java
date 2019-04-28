public class MyFirstGame {
    public static void main(String[] args) {
        int computerNumber = 30;
        int playerNumber = 40;

        while (playerNumber >= computerNumber) {
            if (playerNumber < computerNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else if (playerNumber > computerNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else {
                System.out.println("Вы угадали!");
            }
            playerNumber--;
        }
    }
}
