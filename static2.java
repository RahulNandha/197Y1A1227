public class static2 
{
  static int age;
  static 
  {
    age = 18;
    System.out.println(age);
  }  
  static void disp()
  {
    System.out.println("Nandha");
  }
  public static void main(String[] args) 
  {
    System.out.println("27");
    static2 s = new static2();
    s.disp();  
  }
}
