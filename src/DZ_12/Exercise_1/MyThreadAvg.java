package DZ_12.Exercise_1;

import java.util.ArrayList;

public class MyThreadAvg extends Thread {
    String avg;
    ArrayList<Integer> arrayList;

    public MyThreadAvg(String name){
        super(name);
    }

    public void run() {
        System.out.printf("%s поток запустился...\n", Thread.currentThread().getName());
        try {
            System.out.println("Начинаем считать среднее арифметическое...");
            double sum = 0;
            for (int numb : arrayList) {
                sum += numb;
            }
            double res = sum/arrayList.size();
            this.avg = String.format("%.2f",res);
            System.out.println("Среднее арифметическое подсчитано!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
