class Movie{

    Ticket tickets[] = new Ticket[3];
    int index = 0;

    public boolean addTicket(Ticket ticket) {

        boolean isTicketAdded = false;

        boolean isTicketId = false;
        boolean isTicketType = false;
        boolean isTicketPrice = false;

        if (ticket.ticketId > 0) {
            isTicketId = true;
        } else System.out.println("Invalid Id");

        if (ticket.ticketPrice > 0) {
            isTicketPrice = true;
        } else System.out.println("Invalid Price");

        if (ticket.ticketType != null) {
            isTicketType = true;
        } else System.out.println("Invalid Type");

        if (isTicketId && isTicketType && isTicketPrice) {
            if (index < tickets.length) {
                tickets[index] = ticket;
                index++;
                isTicketAdded = true;
            } else System.out.println("Array full");
        }

        return isTicketAdded;
    }

    public void getTicket() {
        for (Ticket ticket : tickets) {
            if (ticket != null) {
                System.out.println(ticket);
            }
        }
    }

    public boolean updateTicket(int existingId, String newType) {
        boolean isUpdated = false;

        for (Ticket ticket : tickets) {
            if (ticket != null && ticket.ticketId == existingId) {
                ticket.ticketType = newType;
                isUpdated = true;
            }
        }

        if (!isUpdated) {
            System.out.println("Ticket not found");
        }

        return isUpdated;
    }


    public boolean deleteTicket(int existingId) {
        boolean isDeleted = false;

        for (Ticket ticket : tickets) {
            if (ticket != null && ticket.ticketId == existingId) {
                ticket.ticketId = 0;
                ticket.ticketType = null;
                ticket.ticketPrice = 0;
                isDeleted = true;
            }
        }

        if (!isDeleted) {
            System.out.println("Ticket not found");
        }

        return isDeleted;
    }

    
    public boolean searchTicket(int existingId) {
        boolean isFound = false;

        for (Ticket ticket : tickets) {
            if (ticket != null && ticket.ticketId == existingId) {
                System.out.println(ticket);
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("Ticket not found");
        }

        return isFound;
    }
}