import java.util.Scanner;

interface PaymentMethod {
    void makePayment(double amount);
}

class Cinema {
    private String cityName;
    private double ticketCost;

    public Cinema(String cityName, double ticketCost) {
        this.cityName = cityName;
        this.ticketCost = ticketCost;
    }

    public String getCityName() {
        return cityName;
    }

    public void displayMovieOptions() {
        System.out.println("1. Baahubali 2 (Rating: 4.5)");
        System.out.println("2. Saaho (Rating: 3.8)");
        System.out.println("3. Mirchi (Rating: 4.0)");
    }

    public double getTicketCost() {
        return ticketCost;
    }
}

class City1 extends Cinema {
    public City1() {
        super("City1", 10.0);
    }
}

class City2 extends Cinema {
    public City2() {
        super("City2", 12.0);
    }
}

class City3 extends Cinema {
    public City3() {
        super("City3", 8.0);
    }
}

class TicketBookingSystem {
    private Cinema cinema;

    public TicketBookingSystem(Cinema cinema) {
        this.cinema = cinema;
    }

    public void bookTicket() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to " + cinema.getCityName() + " Cinema");
        cinema.displayMovieOptions();

        System.out.print("Enter the movie number: ");
        int movieNumber = scanner.nextInt();

        System.out.print("Enter the number of tickets: ");
        int numTickets = scanner.nextInt();

        double totalCost = cinema.getTicketCost() * numTickets;

        System.out.println("Total Cost: rupees" + totalCost);

    
        boolean[] seatAvailability = new boolean[20]; 
        for (int i = 0; i < numTickets; i++) {
            int seatNumber;
            do {
                System.out.print("Enter seat number for ticket " + (i + 1) + ": ");
                seatNumber = scanner.nextInt();
            } while (seatNumber < 1 || seatNumber > 20 || seatAvailability[seatNumber - 1]);
            seatAvailability[seatNumber - 1] = true;
        }

    
        PaymentMethod paymentMethod = getPaymentMethod();
        paymentMethod.makePayment(totalCost);

        System.out.println("Ticket booked successfully!");
    }

    private PaymentMethod getPaymentMethod() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.print("Enter your choice: ");
        int paymentChoice = scanner.nextInt();

        switch (paymentChoice) {
            case 1:
                return new CreditCardPayment();
            default:
                throw new IllegalArgumentException("Invalid payment choice");
        }
    }
}

class CreditCardPayment implements PaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card");
    }
}

class Main {
    public static void main(String[] args) {
        City1 city1 = new City1();
        City2 city2 = new City2();
        City3 city3 = new City3();
        TicketBookingSystem bookingSystem1 = new TicketBookingSystem(city1);
        bookingSystem1.bookTicket();

        TicketBookingSystem bookingSystem2 = new TicketBookingSystem(city2);
        bookingSystem2.bookTicket();

        TicketBookingSystem bookingSystem3 = new TicketBookingSystem(city3);
        bookingSystem3.bookTicket();
    }
}
