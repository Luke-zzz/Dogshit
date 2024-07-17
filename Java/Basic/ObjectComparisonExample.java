public class ObjectComparisonExample {
  public static void main(String[] args) {
    Double x=new Double(123.45555);
    Long y=new Long(9887544);
    System.out.println("Objects are not equal,hnce it returns "+x.equals(y));
    System.out.println("Objects are qual, hence it returns "+ x.equals(123.45555));
  }
}
