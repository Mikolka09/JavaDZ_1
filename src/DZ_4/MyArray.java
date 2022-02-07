package DZ_4;

import java.util.Random;
import java.util.Scanner;

public class MyArray<T> {
    T arr;
    Scanner scanner = new Scanner(System.in);

    public T getArr() {
        return arr;
    }

    public MyArray(T arr) {
        this.arr = arr;
    }

    public int[] fillIntArray() {
        System.out.print("Ввведите занчение для добавление в массив через пробел: ");
        String[] get = scanner.nextLine().split(" ");
        int length = get.length;
        int[] arrNew = new int[length];
        for (int i = 0; i < get.length; i++)
            arrNew[i] = Integer.parseInt(get[i]);
        return arrNew;
    }

    public double[] fillDoubleArray() {
        System.out.print("Ввведите занчение для добавление в массив через пробел: ");
        String[] get = scanner.nextLine().split(" ");
        int len = get.length;
        double[] arr = new double[len];
        for (int i = 0; i < get.length; i++)
            arr[i] = Double.parseDouble(get[i]);
        return arr;
    }

    public String[] fillStringArray() {
        System.out.print("Ввведите занчение для добавление в массив через пробел: ");
        String[] get = scanner.nextLine().split(" ");
        return get;
    }

    public int[] fillIntRandom(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(500);
        }
        return arr;
    }

    public double[] fillDoubleRandom(double[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble() * 100;
        }
        return arr;
    }

    public int maxIntArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public int minIntArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public double maxDoubleArray(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    public double minDoubleArray(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

    public double avgIntArray(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public double avgDoubleArray(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public int[] sortIntAsc(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] sortIntDesc(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public double[] sortDoubleAsc(double[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public double[] sortDoubleDesc(double[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }




}
