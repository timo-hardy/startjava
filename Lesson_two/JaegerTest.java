public class JaegerTest {

  public static void main(String[] args) {
    Jaeger gipsyDanger = new Jaeger();
    gipsyDanger.setName("Gipsy Danger");
    gipsyDanger.setMark("Mark-3");
    gipsyDanger.setStatus("Destroyed");
    gipsyDanger.setHeight(79.25);
    gipsyDanger.setWeight(1.98);

    System.out.println(gipsyDanger.getName());
    System.out.println(gipsyDanger.getMark());
    System.out.println(gipsyDanger.getStatus());
    System.out.println(gipsyDanger.getHeight());
    System.out.println(gipsyDanger.getWeight());

    System.out.println(); //so that it looks beautifull in the console

    Jaeger gipsyAvenger = new Jaeger();
    gipsyAvenger.setName("Gipsy Avenger");
    gipsyAvenger.setMark("Mark-6");
    gipsyAvenger.setStatus("Destroyed");
    gipsyAvenger.setHeight(81.77);
    gipsyAvenger.setWeight(2.004);

    System.out.println(gipsyAvenger.getName());
    System.out.println(gipsyAvenger.getMark());
    System.out.println(gipsyAvenger.getStatus());
    System.out.println(gipsyAvenger.getHeight());
    System.out.println(gipsyAvenger.getWeight());
  }
}
