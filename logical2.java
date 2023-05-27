import java.util.Scanner;

public class logical2 
{
    public static void main(String[] args) 
    {
        int marks;
        System.out.println("enter the marks:");
        try (Scanner s = new Scanner(System.in)) {
            marks=s.nextInt();
        }
        {
            if(marks>60)
            {
                System.out.println("he is eligible for B.tech");
            }
            else
            {
                System.out.println("he need to improve his skills");
            }
        }   
    }
}
