
package javaapplication96;

import java.util.List;


public class JavaApplication96 {


    public static void main(String[] args) {
    
            
        
    List<Room> rooms = createSampleRooms();


        
        for (Room room :  rooms) {
            System.out.println(room);
        }
    }
    
    public static List<Room> createSampleRooms() {
                //create room objects
        Room room1 = new Room("Taff", "Small meeting room", 2, 8);
        Room room2 = new Room("Llangorse", "Large meeting room", 2, 24);
        Room room3 = new Room("Pen y Fan", "Teaching space", 2, 70);
        Room room4 = new Room("Usk", "Small meeting room", 3, 8);
        Room room5 = new Room("Bala", "Large meeting room", 3, 24);
        Room room6 = new Room("Cadair Idris", "Teaching space", 3, 70);
        Room room7 = new Room("Wye", "Small meeting room", 4, 8);
        Room room8 = new Room("Gower", "Open meeting/break-Out space", 4, 24);
        Room room9 = new Room("Snowdon", "Teaching space", 4, 70);
         Library.rooms.add(room1);
        Library.rooms.add(room2);
        Library.rooms.add(room3);
        Library.rooms.add(room4);
        Library.rooms.add(room5);
       Library. rooms.add(room6);
        Library.rooms.add(room7);
       Library. rooms.add(room8);
        Library.rooms.add(room9);
        return  Library.rooms;
    }
    
}
