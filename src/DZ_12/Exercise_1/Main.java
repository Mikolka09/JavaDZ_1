package DZ_12.Exercise_1;

import java.util.ArrayList;


public class Main {
    static MyThread myThread;
    static MyThreadSum myThreadSum;
    static MyThreadAvg myThreadAvg;
    public static void main(String[] args) throws InterruptedException {
        myThread = new MyThread("Start");
        myThreadSum = new MyThreadSum("Summa");
        myThreadAvg = new MyThreadAvg("Avg");
        myThread.start();
        myThread.join();
        myThreadSum.arrayList = myThread.arrayList;
        myThreadAvg.arrayList = myThread.arrayList;
        myThreadSum.start();
        myThreadAvg.start();
        myThreadSum.join();
        myThreadAvg.join();
        System.out.println("Сумма всех элементов будет равна: "+myThreadSum.sum);
        System.out.println("Среднее арифметическое будет равно: "+myThreadAvg.avg);

        System.out.println("FINISH");
    }
}
