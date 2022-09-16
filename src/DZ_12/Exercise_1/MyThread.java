package DZ_12.Exercise_1;

import java.util.ArrayList;
import java.util.Random;

public class MyThread extends Thread{

    Random rand = new Random();

    public MyThread(String name){
        super(name);
    }

    public void run(ArrayList<Integer> arrayList){
        try {
            System.out.printf("%s поток запустился...\n",Thread.currentThread().getName());
            System.out.println("Начинается заполнение массива");
            int bool = 0;
            while (bool<100){
                int numb = this.rand.nextInt();
                arrayList.add(numb);
                Thread.sleep(20);
                bool++;
            }
            System.out.println("Массив заполнен!");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
