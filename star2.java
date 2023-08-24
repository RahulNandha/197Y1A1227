
import java.util.Scanner;

public class star2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Printing the star pattern
        for (int i = 0; i <= n; i++) 
        {
            for (int j = 0; j <= n; j++) 
            {
                System.out.print("* ");
            } 
            System.out.println();
        }
    }
}

