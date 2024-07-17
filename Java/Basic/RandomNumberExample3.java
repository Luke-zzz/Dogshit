import java.util.Random;

public class RandomNumberExample3 {
  public static void main(String[] args) {
    Random random =new Random();
    int x=random.nextInt(50);
    int y=random.nextInt(1000);

    System.out.println("Randomly Generated Integers Values");
    System.out.println(x);   
    System.out.println(y);
    
    //Prints random double values
    double a=random.nextDouble();
    double b=random.nextDouble();
    System.out.println("Randomly Generated Ddouble Values");
    System.out.println(a);   
    System.out.println(b);      

    //Generateds Random float values
    float f=random.nextFloat();
    float i=random.nextFloat();
    System.out.println("Randomly Generated Float Values");
    System.out.println(f);   
    System.out.println(i); 

    // Generates Random Long values  
    long p = random.nextLong();   
    long q = random.nextLong();   
    // Prints random long values  
    System.out.println("Randomly Generated Long Values");  
    System.out.println(p);   
    System.out.println(q);    
    // Generates Random boolean values  
    boolean m=random.nextBoolean();  
    boolean n=random.nextBoolean();  
    // Prints random boolean values  
    System.out.println("Randomly Generated Boolean Values");
    System.out.println(m);   
    System.out.println(n);  

  }
}
