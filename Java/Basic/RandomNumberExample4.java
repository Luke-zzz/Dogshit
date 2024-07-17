import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberExample4 {
  public static void main(String[] args) {
    int a=ThreadLocalRandom.current().nextInt();
    int b=ThreadLocalRandom.current().nextInt();

    System.out.println("Randomly Generated Integer Values:");
    System.out.println(a);
    System.out.println(b);

    //double random
    double c=ThreadLocalRandom.current().nextDouble();
    double d=ThreadLocalRandom.current().nextDouble();
    System.out.println("Randomly Generated double Values:");
    System.out.println(c);
    System.out.println(d);

    boolean e=ThreadLocalRandom.current().nextBoolean();
    boolean f=ThreadLocalRandom.current().nextBoolean();
    System.out.println("Randomly Generated boolean Values:");
    System.out.println(c);
    System.out.println(d);

  }
}
