public class static1 
{
 static int age;
 static 
 {
    age=18;
    System.out.println(age);
 }    
 static void disp()
 {
    System.out.println("Nandha");
 }
 public static void main(String[] args) 
 {
    System.out.println("27");
    static1 s = new static1();
    s.disp();   
 }
}
