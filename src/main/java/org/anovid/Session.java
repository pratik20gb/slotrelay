package org.anovid;

public class Session {
    private final long id;
    private final String title;
    private final int capacity;
    private int bookedSeats = 0;

    public Session(long id, String title, int capacity) {
        this.id = id;
        this.title = title;
        this.capacity = capacity;
        if(capacity <= 0){
            throw new IllegalArgumentException("Capacity must be greater than 0.");
        }
    }
    public long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getBookedSeats() {
        return bookedSeats;
    }
public int getAvailableSeats() {
    return capacity - bookedSeats;
}
public boolean isFull() {
    return capacity == bookedSeats;
}

public void bookSeats(int seats){
        if(seats<=0){
            throw new IllegalArgumentException("Seats must be greater than zero.");
        }
        if(seats>getAvailableSeats()){
            throw new IllegalStateException("Not enough seats available");
        }
       bookedSeats += seats;

}
public void cancelSeats(int seats){
        if(seats<=0){
            throw new IllegalArgumentException("Seats must be greater than zero.");
        }
    if (seats > bookedSeats) {
        throw new IllegalStateException("Cannot cancel more seats than are booked.");
    }
        bookedSeats -= seats;
}
public String toString(){
        return "Session{name=' "+id + "', title='"+title+"', capacity="+capacity+"}";
}

}
