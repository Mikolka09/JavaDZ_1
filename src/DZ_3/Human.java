package DZ_3;

public class Human {
    String name;
    int age;
    int height;

    public Human() {
        this.name = "No name";
        this.age = 0;
        this.height = 0;
    }

    public Human(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String toString() {
        return "Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Height: " + this.height;
    }
}

