package DZ_2;

public class City {
    String title;
    int ageCity;
    int population;

    public City() {
        this.title = "No title";
        this.ageCity = 1;
        this.population = 1;
    }

    public City(String title) {
        this.title = title;
        this.ageCity = 1;
        this.population = 1;
    }

    public City(String title, int ageCity) {
        this.title = title;
        this.ageCity = ageCity;
        this.population = 1;
    }

    public City(String title, int ageCity, int population) {
        this.title = title;
        this.ageCity = ageCity;
        this.population = population;
    }

    public String toString() {
        return "Title: " + this.title + "\n" + "AgeCity: " + this.ageCity + "\n" + "Population: " + this.population;
    }
}
