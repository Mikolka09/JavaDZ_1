package DZ_3;

public class Car extends Device {
    public Car(String name, String desc) {
        super(name, desc);
        this.name = "Car";
        this.desc = "This super Car!";
    }

    public void Sound() {
        System.out.println("Try-try-try-try-try!!!!");
    }


}
