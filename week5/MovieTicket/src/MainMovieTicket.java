public class MainMovieTicket{
    public static void main(String[] args) {
        
        MovieTicket ticket1 = new MovieTicket("Inception", 12, 10.99);
        
      
        ticket1.displayTicket();

      
        ticket1.bookTicket();

       
        ticket1.displayTicket();
    }
}
