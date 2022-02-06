package DZ_3;

public class Microwave extends Device {
    public Microwave(String name, String desc) {
        super(name, desc);
        this.name = "Microwave";
        this.desc = "This super Microwave!";
    }

    public void Sound() {
        System.out.println("Pay-pay-pay-pay-pay!!!!");
    }
}
