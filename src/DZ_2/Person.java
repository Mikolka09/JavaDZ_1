package DZ_2;

public class Person {
    String name;
    int age;

    public Person() {
        this.name = "No name";
        this.age = 18;
    }

    public Person(String name) {
        this.name = name;
        this.age = 18;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.name + "\n" + "Age: " + this.age;
    }
}
