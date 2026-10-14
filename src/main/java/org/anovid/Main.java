package org.anovid;
public class Main {
    static void main() {
        Session one = new Session(1,"Java Mock Interview",2);
        System.out.println(one.getTitle());
        System.out.println(one.getAvailableSeats());
        System.out.println(one.isFull());
    }
}
