class h1
{
 int age;
 h1()
 {
    System.out.println("Rahul");
 }
 void sleep()
 {
    age=18;
    System.out.println("Nandha");
    System.out.println(age);
 }
}
 class std1 extends h1
 {
    void disp()
    {
        System.out.println("the age is:"+age); 
    }
 }
public class inhrtitence 
{
    public static void main(String[] args) 
    {
        std1 s = new std1();
        s.sleep();
        s.disp();    
    }    
}
