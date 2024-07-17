
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {
  public static void main(String[] args) {
    try{
      ObjectInputStream in =new ObjectInputStream(new FileInputStream("employee.txt"));
      Employee2 e=(Employee2)in.readObject();

      System.out.println(e.empid+" "+e.empname);
      in.close();
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
