class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Man");
        wolfOne.setNickname("Mike");
        wolfOne.setWeight(12.4);
        wolfOne.setAge(10);
        wolfOne.setColor("Brown");
        System.out.println(wolfOne.getGender());
        System.out.println(wolfOne.getNickname());
        System.out.println(wolfOne.getWeight());
        System.out.println(wolfOne.getAge());
        System.out.println(wolfOne.getColor());
    }
}
