public class ClassLoaderExample {
  public static void main(String[] args){
    //Let's print the classloader name of current class

    Class c = ClassLoaderExample.class;
    System.out.println(c.getClassLoader());

    System.out.println(String.class.getClassLoader());
  }
}
