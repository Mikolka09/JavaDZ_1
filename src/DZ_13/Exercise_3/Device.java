package DZ_13.Exercise_3;

import lombok.Data;

@Data
public class Device {
    String name;
    int date;
    int price;
    String color;
    String type;

    public Device(String name, int date, int price, String color, String type) {
        this.name = name;
        this.date = date;
        this.price = price;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " " + "Date: " + this.date + " " + "Price: " + this.price + " " +
                "Color: " + this.color + " " + "Type: " + this.type;
    }
}
