import java.util.Scanner;

class star
{
    public static void main(String[] args) 
    {
        int i,j,n;
        System.out.println("enter the value of n:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        {
            for(j=0; j<n; j++)
            {
                for(i=0; i<n; i++ )
                {
                 System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}