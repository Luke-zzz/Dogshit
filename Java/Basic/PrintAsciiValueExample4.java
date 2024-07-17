import java.util.Scanner;

public class PrintAsciiValueExample4 {
  public static void main(String[] args) {
    System.out.println("Enter a charcter:");
    Scanner sc=new Scanner(System.in);
    char chr =sc.next().charAt(0);
    int asciiValue=chr;
    System.out.println("ASCII value of " +chr+ " is: "+asciiValue);
  }
}
