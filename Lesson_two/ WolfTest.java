class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        System.out.println(wolfOne.gender);
        System.out.println(wolfOne.nickname);
        System.out.println(wolfOne.weight);
        System.out.println(wolfOne.age);
        System.out.println(wolfOne.color);
        wolfOne.run();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.hunt();
        wolfOne.isRave();
    }
}
