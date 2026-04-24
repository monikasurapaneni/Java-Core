public class MovieExecutor {
    public static void main(String[]args) {

        Movie movie = new Movie();

        Ticket t1 = new Ticket();
        t1.ticketId = 1;
        t1.ticketType = "Gold";
        t1.ticketPrice = 250;

        Ticket t2 = new Ticket();
        t2.ticketId = 2;
        t2.ticketType = "Silver";
        t2.ticketPrice = 150;

        Ticket t3 = new Ticket();
        t3.ticketId = 3;
        t3.ticketType = "Platinum";
        t3.ticketPrice = 300;

        
        movie.addTicket(t1);
        movie.addTicket(t2);
        movie.addTicket(t3);

      
        System.out.println("All Tickets:");
        movie.getTicket();

        
        System.out.println("Search Ticket ID 2:");
        movie.searchTicket(2);

        System.out.println("Update Ticket ID 3:");
        movie.updateTicket(3, "VIP");
        movie.getTicket();

        
        System.out.println("Delete Ticket ID 1:");
        movie.deleteTicket(1);
        movie.getTicket();
    }
}