
package inheritance.webshop;

public class Vehicle extends Product {

    private String manufacturer;
    private String model;
    private int year;

    public Vehicle(String title, String description, double price, String manufacturer, String model, int year) {
        super(title, description, price);
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return super.toString() + ", manufacturer=" + manufacturer
                + ", model=" + model + ", year=" + year;
    }
}
