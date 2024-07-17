public class VariableType {
  static int m=100;//static variabl
  void method(){
    int n=90;//local variable
  }
  public static void main(String[] args) {
    int data =50;// instance variable

    //Add two numbers
    int a=10;
    int b=10;
    int c=a+b;
    System.out.println(c);

    //Widening
    float f=a;
    System.out.println(a);
    System.out.println(f);

    //Narrowing
    float g=10.5f;
    int h=(int)f;
    System.out.println(g);
    System.out.println(h);

    //Overflow
    int j=130;
    byte k=(byte)j;
    System.out.println(j);
    System.out.println(k);


    //Adding lower type
    byte l=10;
    byte o=10;
    //byte c=a+b;//Compile Time Error: because a+b=20 will be int  
    byte z=(byte)(a+b);
    System.out.println(z);
  }
}
