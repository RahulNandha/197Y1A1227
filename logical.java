import java.util.Scanner;

public class logical 
{
 public static void main(String[] args) 
 {
    int age;
    System.out.println("enter the value of age:");
    try (Scanner s = new Scanner(System.in)) {
        age=s.nextInt();
    }
    if(age>=21)
    {
       System.out.println("he is eligible to drive");
    }
    else
    {
      System.out.println("he is not eligible to drive");
    }       
 }
}
