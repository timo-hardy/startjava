public class ConditionalStatement {

    public static void main(String[] args) {
        int age = 23;
        if (age > 20) {
            System.out.println("I am getting older");
        }

        boolean isMan = true;
        if (isMan) {
            System.out.println("I was lucky");
        }

        if (!isMan) {
            System.out.println("It's very bad");
        }

        double myHeight = 1.73;
        if (myHeight < 1.80) {
            System.out.println("I will grow up");
        } else {
            System.out.println("I am Mikle Jordan");
        }

        char MyNameStartsWithALetter = 'T';
        if (MyNameStartsWithALetter == 'M') {
            System.out.println("My name does not start with - M");
        } else if (MyNameStartsWithALetter == 'I') {
            System.out.println("My name does not start with - I");
        } else {
            System.out.println("My name starts with - " + MyNameStartsWithALetter);
        }
    }
}
