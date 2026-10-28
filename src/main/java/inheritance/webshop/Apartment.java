package inheritance.webshop;

/**
 * The Apartment class represents an apartment in a webshop. Like the Vehicle
 * class, the Apartment class should inherit the Product class.
 *
 * In real life an apartment would likely have additional properties, such as
 * the number of rooms, the size in square meters, the floor number, etc. In
 * this exercise, you can decide yourself which properties you want to add. You
 * can also decide yourself how the toString() method should look like.
 *
 * This class will not be autograded, so it is up to you to test it. You can
 * also skip this class and continue with the next part of the exercise if you
 * feel that you have understood the concept of inheritance.
 */
public class Apartment {
    private double rooms ; 
    private double m2 ;
    private double price;

    
    @Override
    public String toString() {
        return "Apartment [rooms=" + rooms + ", m2=" + m2 + ", price=" + price + "]";
    }

    
    public double getRooms() {
        return rooms;
    }
    public void setRooms(double rooms) {
        this.rooms = rooms;
    }
    public double getM2() {
        return m2;
    }
    public void setM2(double m2) {
        this.m2 = m2;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    


}
