package DZ_2;

public class Car {
    String title;
    String manufacturer;
    int year;
    double volume;

    public Car() {
        this.title = "No title";
        this.manufacturer = "No manufacturer";
        this.year = 1970;
        this.volume = 0;
    }

    public Car(String title, String manufacturer, int year, double volume) {
        this.title = title;
        this.manufacturer = manufacturer;
        this.year = year;
        this.volume = volume;
    }

    public String getTitle() {
        return title;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public double getVolume() {
        return volume;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String toString() {
        return "Title: " + this.title + "\n" + "Manufacturer: " + this.manufacturer +
                "\n" + "Year: " + this.year + "\n" + "Volume: " + this.volume;
    }
}
