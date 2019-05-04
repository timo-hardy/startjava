public class Wolf {

    private String gender;
    private String nickname;
    private double weight;
    private int age;
    private String color;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getWeight() {
        return  weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return  color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void go() {
        System.out.println("Go");
    }

    public void sit() {
        System.out.println("Sit");
    }

    public void run() {
        System.out.println("Run");
    }

    public String hunt() {
        return "chicken";
    }

    public boolean isRave() {
        return true;
    }
}
