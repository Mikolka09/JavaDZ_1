package DZ_12.Exercise_2;

import java.io.FileWriter;
import java.util.Random;

public class MyThreadRandom extends Thread {

    String path;
    FileWriter file = null;
    Random rand = new Random();

    public MyThreadRandom(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Запустился поток: "+ Thread.currentThread().getName());
        try {
            int numb;
            this.file = new FileWriter(this.path);
            for (int i = 0; i < 10; i++) {
                numb = rand.nextInt(1, 16);
                file.write(numb + " ");
            }
            file.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
