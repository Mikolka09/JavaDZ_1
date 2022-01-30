package DZ_1;

import java.util.ArrayList;
import java.util.Random;

public class Exercise_10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++)
            arr[i] = rand.nextInt();
        ArrayList<Integer> arrChet = new ArrayList<Integer>();
        ArrayList<Integer> arrNet = new ArrayList<Integer>();
        ArrayList<Integer> arrPlus = new ArrayList<Integer>();
        ArrayList<Integer> arrMinus = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            if (arr[i] %2 ==0) arrChet.add(arr[i]);
            if (arr[i] %2 !=0) arrNet.add(arr[i]);
            if (arr[i] < 0) arrPlus.add(arr[i]);
            if (arr[i] > 0) arrMinus.add(arr[i]);
        }
        System.out.println("Массив четных чисел: " + arrChet.toString());
        System.out.println("Массив нечетных чисел: " + arrNet.toString());
        System.out.println("Массив отрицательных чисел: " + arrPlus.toString());
        System.out.println("Массив положительных чисел: " + arrMinus.toString());

    }
}
