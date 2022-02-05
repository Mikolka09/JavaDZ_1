package DZ_3;

public class Builder extends Human {
    String position;
    int salary;

    public Builder() {
        this.name = "No name";
        this.age = 0;
        this.height = 0;
        this.position = "No position";
        this.salary = 0;
    }

    public Builder(String name, int age, int height, String position, int salary) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.position = position;
        this.salary = salary;
    }

    public void toWork() {
        System.out.println(this.name + " to Work!");
    }

    public String toString() {
        return "Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Height: " + this.height + "\n" +
                "Position: " + this.position + "\n" + "Salary: " + this.salary;
    }
}
