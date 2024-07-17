import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
  public static void main(String[] args) {
    try{
      Employee2 emp =new Employee2(198054, "Andrew");
      FileOutputStream fout =new FileOutputStream("Employee.txt");
      ObjectOutputStream out =new ObjectOutputStream(fout);
      out.writeObject(emp);
      out.flush();
      out.close();
      System.out.println("Successfully Created");
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
