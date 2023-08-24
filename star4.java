public class star4 {
    public static void main(String[] args) {
        int i,n=6;
        for(int j=0; j<n; j++)
        {
                for(i=0; i<n; i++)
            {
                if(i==0 || j==0 || i==(n-1) || j==(n-1))
                { 
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
