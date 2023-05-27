import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the marks obtained: ");
            int marks = scanner.nextInt();
            
            int grade = marks / 10;
            
            switch (grade) {
                case 10:
                case 9:
                    System.out.println("Grade: A");
                    break;
                case 8:
                    System.out.println("Grade: B");
                    break;
                case 7:
                    System.out.println("Grade: C");
                    break;
                case 6:
                    System.out.println("Grade: D");
                    break;
                case 5:
                case 4:
                    System.out.println("Grade: E");
                    break;
                default:
                    System.out.println("Grade: F");
                    break;
            }
        }
    }
}
