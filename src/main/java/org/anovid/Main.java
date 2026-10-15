package org.anovid;
public class Main {
    static void main() {

        SessionService service = new SessionService();

        service.addSession(new Session(1, "Java Mock Interview", 2));
        service.addSession(new Session(2, "Spring Boot Practice", 3));

        try{
            service.bookSeats(1L,1);
            System.out.println("Seats booked successfully");
        }catch(IllegalStateException | IllegalArgumentException e){
            System.out.println("Booking failed: " + e.getMessage());
        }

        try{
            service.cancelSeats(1L,2);
            System.out.println("Seats cancelled successfully");
        }catch(IllegalArgumentException | IllegalStateException e){
            System.out.println("Cancellation failed: " + e.getMessage());
        }


        System.out.println("Program continues");
        System.out.println(service.getSessionById(1L).getBookedSeats());
    }

}
