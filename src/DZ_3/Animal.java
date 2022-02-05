package DZ_3;

public class Animal {
    String name;
    int age;
    int power;
    String color;
    String role;

    public void Parameters(String name, int age, int power, String color, String role) {
        System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Power: " + this.power +
                "\n" + "Color: " + this.color + "\n" + "Role: " + this.role);
    }

    public void actionAnimal(){
        System.out.println("The animal performs its action!");
    }

}

