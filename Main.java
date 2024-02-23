interface Payment {
    void processPayment(double amount);
}

class Seat {
    private int row;
    private int column;
    private boolean isOccupied;

    public Seat(int row, int column) {
        this.row = row;
        this.column = column;
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void occupy() {
        isOccupied = true;
    }

    public void display() {
        System.out.print((isOccupied ? "X" : "O") + " ");
    }
}

class Theater {
    private Seat[][] seats;

    public Theater(int numRows, int numColumns) {
        seats = new Seat[numRows][numColumns];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                seats[i][j] = new Seat(i + 1, j + 1);
            }
        }
    }

    public void display() {
        for (Seat[] row : seats) {
            for (Seat seat : row) {
                seat.display();
            }
            System.out.println();
        }
    }

    public boolean bookSeat(int row, int column) {
        if (row >= 1 && row <= seats.length && column >= 1 && column <= seats[0].length) {
            Seat selectedSeat = seats[row - 1][column - 1];
            if (!selectedSeat.isOccupied()) {
                selectedSeat.occupy();
                return true;
            } else {
                System.out.println("Seat is already occupied. Please choose another seat.");
            }
        } else {
            System.out.println("Invalid seat selection. Please choose a valid seat.");
        }
        return false;
    }
}

class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater(3, 4);
        theater.display();

        int selectedRow = 2;
        int selectedColumn = 3;

        if (theater.bookSeat(selectedRow, selectedColumn)) {
            double ticketPrice = 20.0; // Set the ticket price
            Payment paymentMethod = new CreditCardPayment();
            paymentMethod.processPayment(ticketPrice);

            System.out.println("Seat booked successfully!");
        }

        System.out.println("Updated seat status:");
        theater.display();
    }
}
