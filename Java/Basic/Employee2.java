import java.io.Serializable;

public class Employee2 implements Serializable {
  int empid;
  String empname;
  public Employee2(int empid,String empname){
    this.empid=empid;
    this.empname=empname;
  }
}
