
package javaapplication96;

import java.time.LocalDateTime;


public class Booking {
    private String username, roomName, date;
    private int numOfPeople, length;
    private LocalDateTime startDateTime, endDateTime;

   



    public Booking(String username, String roomName, String date, LocalDateTime startDateTime, int length, int numOfPeople, LocalDateTime endDateTime) {
        this.username = username;
        this.roomName = roomName;
        this.date = date;
        this.startDateTime = startDateTime;
        this.length = length;
        this.numOfPeople = numOfPeople;
        this.endDateTime = endDateTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

//    public static ArrayList<Booking> getBookings() {
//        return bookings;
//    }
//
//    public static void setBookings(ArrayList<Booking> bookings) {
//        Booking.bookings = bookings;
//    }
}



