package DZ_3;

public class Steamer extends Device{
    public Steamer(String name, String desc) {
        super(name, desc);
        this.name = "Steamer";
        this.desc = "This super Steamer!";
    }

    public void Sound() {
        System.out.println("Ty-ty-ty-ty-ty!!!!");
    }
}
