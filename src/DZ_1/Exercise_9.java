package DZ_1;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Exercise_9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[200];
        for (int i = 0; i < 200; i++)
            arr[i] = rand.nextInt();
        int max = arr[0];
        int min = arr[0];
        int plus = 0;
        int minus = 0;
        int nul = 0;
        for (int i = 0; i < 200; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
            if (arr[i] < 0) minus++;
            if (arr[i] > 0) plus++;
            if (arr[i] == 0) nul++;
        }
        System.out.println("Максимальное число в массиве: " + max);
        System.out.println("Минимальное число в массиве: " + min);
        System.out.println("Кол-во положительных чисел в массиве: " + plus);
        System.out.println("Кол-во отрицательных чисел в массиве: " + minus);
        System.out.println("Кол-во нулей в массиве: " + nul);
    }
}
