import java.util.Scanner;

class pattern
{
    public static void main(String[] args) {
        int i,j,k;

        System.out.println("Enter the value of k");
        Scanner s = new Scanner(System.in);
        k = s.nextInt();

       { 
        for(i=0; i<k; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print("*");
            }
        }System.out.println();
       }
    }
}