package DZ_3;

public class Kettle extends Device {

    public Kettle(String name, String desc) {
        super(name, desc);
        this.name = "Kettle";
        this.desc = "This super Kettle!";
    }

    public void Sound() {
        System.out.println("Pi-pi-pi-pi-pi!!!!");
    }

}