package DZ_2;

public class Country {
    String title;
    String location;
    int ageCountry;
    int population;

    public Country() {
        this.title = "No title";
        this.location = "Undefined";
        this.ageCountry = 1;
        this.population = 1;
    }

    public Country(String title,  String location) {
        this.title = title;
        this.location = location;
        this.ageCountry = 1;
        this.population = 1;
    }

    public Country(String title, String location, int ageCountry) {
        this.title = title;
        this.location = location;
        this.ageCountry = ageCountry;
        this.population = 1;
    }

    public Country(String title, String location, int ageCountry, int population) {
        this.title = title;
        this.location = location;
        this.ageCountry = ageCountry;
        this.population = population;
    }

    public String toString() {
        return "Title: " + this.title + "\n" + "Location: " + this.location +
                "\n" + "AgeCountry: " + this.ageCountry + "\n" + "Population: " + this.population;
    }
}
