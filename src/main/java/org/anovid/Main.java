package org.anovid;
public class Main {
    static void main() {
        Session one = new Session(1,"Java Mock Interview",12);
        one.bookSeats(10);
        one.cancelSeats(5);

        System.out.println("Total booked: " + one.getBookedSeats());
        System.out.println("Available: " + one.getAvailableSeats());
    }

}
