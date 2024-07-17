public class CreateObjectExample3 implements Cloneable {
  @Override
  protected Object clone() throws CloneNotSupportedException{
    return super.clone();
  }

  String str="New Object Created";
  public static void main(String[] args) {
    CreateObjectExample3 obj1 = new CreateObjectExample3()  ;
    try{
      CreateObjectExample3 obj2=(CreateObjectExample3) obj1.clone();
      System.out.println(obj2.str);
    }catch(CloneNotSupportedException e){
      e.printStackTrace();
    }
  }
}
