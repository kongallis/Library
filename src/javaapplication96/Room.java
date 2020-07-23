package javaapplication96;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private String name, type;
    private int floor, capacity;
    

    //Constructor Room
    public Room(String name, String type, int floor, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Room{" + "name=" + name + ", type=" + type + ", floor=" + floor + ", capacity=" + capacity + '}';
    }


}
