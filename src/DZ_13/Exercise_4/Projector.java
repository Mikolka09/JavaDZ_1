package DZ_13.Exercise_4;

public class Projector {

    String name;
    int date;
    int price;
    String manufacturer;

    public Projector(String name, int date, int price, String manufacturer) {
        this.name = name;
        this.date = date;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " " + "Date: " + this.date + " " + "Price: " + this.price + " " +
                "Manufacturer: " + this.manufacturer;
    }
}
