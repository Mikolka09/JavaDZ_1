package DZ_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise_12 {
    public static int[] sortArrDesk(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;
    }

    public static int[] sortArrUnDesk(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int[] arr = new int[50];
        for (int i = 0; i < 50; i++)
            arr[i] = rand.nextInt() * 50;
        System.out.print("Какую сортировку массива выполнить: \n" +
                "\t1.По убыванию\n\t2.По возростанию\n");
        System.out.print("Сделайте Ваш выбор: ");
        int var = scanner.nextInt();
        switch (var) {
            case 1:
                sortArrUnDesk(arr);
                System.out.println(Arrays.toString(arr));
                break;
            case 2:
                sortArrDesk(arr);
                System.out.println(Arrays.toString(arr));
                break;
            default:
                System.out.println("Вы ввели неправильное число!");
                break;
        }
    }
}
