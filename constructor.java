class student
{
    private String name="Rahul Nandha";
    private int age =18; 

    student()
    {
        this.name =name;
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge() 
    {
        return age;
    }
}
public class constructor 
{
 public static void main(String[] args) 
 {
   {
    student s = new student();
    String name = s.getName();
    System.out.println(name);
    int age=s.getAge();
    System.out.println(age);
   }   
 }    
}
