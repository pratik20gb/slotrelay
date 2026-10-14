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

}
