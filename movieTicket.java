import java.util.*;
class cities
{
    private static final boolean Goa = false;

    void display()
    {
        String[] cities = {"Goa", "Pune", "Mumbai"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a city name: ");
        String cityName = scanner.nextLine();

        boolean found = false;

        for (String city : cities) {
            if (city.equalsIgnoreCase(cityName)) {
                found = true;
                break;
            }
        }

        if (found)
        {
            System.out.println("Theaters are available in this city");
        }
        else {
            System.out.println("Theaters are not available in this city");
        }if (found = cities.length())
         {
            
        } else {
            System.out.println("No theaters are found");
        }
        

        scanner.close();
    }

}





public class movieTicket 
{
    public static void main(String[] args) {
        System.out.println("Welcome to Shabari online movie ticket booking system");
        System.out.println("The available cities are : Goa, pune, Mumbai");

        cities a = new cities();
        a.display();
    }
}
