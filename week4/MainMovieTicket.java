class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }

    // Method to book a ticket
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully for " + movieName + " at Seat No: " + seatNumber);
        } else {
            System.out.println("Seat No: " + seatNumber + " is already booked!");
        }
    }


    // Method to display ticket details
    public void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + price);
        System.out.println("Status: " + (isBooked ? "Booked" : "Available"));
    }
}
public class MainMovieTicket{
    public static void main(String[] args) {
        
        MovieTicket ticket1 = new MovieTicket("Inception", 12, 10.99);
        
      
        ticket1.displayTicket();

      
        ticket1.bookTicket();

       
        ticket1.displayTicket();
    }
}
