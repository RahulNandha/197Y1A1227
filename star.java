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
            for(i=0; i<n; i++)
            {
                for(j=0; j<n; j++)
                {
                 if(i==0 || j==0 || i==(n-1) || j==(n-1))
                 {
                    System.out.print("* ");
                 }
                 else
                 {

                 }
                 
                }
            }System.out.println();
        }
    }
}