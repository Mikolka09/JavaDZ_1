package DZ_12.Exercise_1;

import java.util.ArrayList;

public class MyThreadSum extends Thread {
    int sum = 0;
    ArrayList<Integer> arrayList;

    public MyThreadSum(String name){
        super(name);
    }

    public void run() {
        System.out.printf("%s поток запустился...\n", Thread.currentThread().getName());
        try {
            System.out.println("Начинаем считать сумму всех элементов...");
            for (int numb : arrayList) {
                this.sum += numb;
            }
            System.out.println("Сумма подсчитана!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
