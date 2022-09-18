package DZ_12.Exercise_1;

import java.util.ArrayList;
import java.util.Random;

public class MyThread extends Thread {
    ArrayList<Integer> arrayList;
    Random rand = new Random();

    public MyThread(String name) {
        super(name);
    }

    public void run() {
        try {
            this.arrayList = new ArrayList<>();
            System.out.printf("%s поток запустился...\n", Thread.currentThread().getName());
            System.out.println("Начинается заполнение массива");
            int bool = 0;
            while (bool < 50) {
                int numb = this.rand.nextInt(1, 500);
                this.arrayList.add(numb);
                Thread.sleep(20);
                bool++;
            }
            System.out.println("Массив заполнен!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
