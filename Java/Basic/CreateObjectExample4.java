public class CreateObjectExample4 {
  void show(){
    System.out.println("A new object created.");
  }
  public static void main(String[] args) {
    try{
      Class cls = Class.forName("CreateObjectExample4");
      CreateObjectExample4 obj =(CreateObjectExample4) cls.newInstance();
      obj.show();
    }catch(ClassNotFoundException e){
      e.printStackTrace();
    }
    catch(InstantiationException e){
      e.printStackTrace();
    }
    catch(IllegalAccessException e){
      e.printStackTrace();
    } 
  }
}
