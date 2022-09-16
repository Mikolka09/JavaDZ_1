package DZ_12.Exercise_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread("First");
        ArrayList<Integer> arrayList = new ArrayList<>();
        myThread.run(arrayList);
        myThread.join();

        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println("FINISH");
    }
}
