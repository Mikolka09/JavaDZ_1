package DZ_3;

public class Device {
    String name;
    String desc;
    public Device(String name, String desc){
        this.name = name;
        this.desc = desc;
    }

    public void Show() {
        System.out.println("Device: " + this.name);
    }

    public void Desc() {
        System.out.println("Desc: " + this.desc);
    }
}
