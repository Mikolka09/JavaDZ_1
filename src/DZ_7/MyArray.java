package DZ_7;

import java.util.Random;
import java.util.Scanner;

public class MyArray {

    int[] arr;
    int size;
    Scanner scanner = new Scanner(System.in);

    public MyArray(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public void fillArray() {
        System.out.print("Ввведите значение для добавление в массив через пробел: ");
        String[] get = scanner.nextLine().split(" ");
        int length = get.length;
        if (length == size) {
            int[] arrNew = new int[length];
            for (int i = 0; i < get.length; i++)
                arrNew[i] = Integer.parseInt(get[i]);
            this.arr = arrNew;
            System.out.println("Массив создан!");
        } else {
            System.out.println("Количество введенных чисел больше размера массива!");
        }
    }

    public void fillRandom(int max) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(max);
        }
        System.out.println("Массив создан!");
        this.arr = arr;
    }

    public void max() {
        int max = this.arr[0];
        for (int i = 0; i < size; i++) {
            if (max < this.arr[i])
                max = this.arr[i];
        }
        System.out.println();
        System.out.printf("Максимальное значение: %s", max);
    }

    public void min() {
        int min = this.arr[0];
        for (int i = 0; i < size; i++) {
            if (min > this.arr[i])
                min = this.arr[i];
        }
        System.out.println();
        System.out.printf("Минимальное значение: %s", min);
    }

    public void avg() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += this.arr[i];
        }
        System.out.println();
        System.out.printf("Среднеарифметическое: %s", sum / size);
    }

    public void sortAsc() {
        for (int i = size - 1; i >= 0; i--) {
            for (int j = i; j < size - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println();
        System.out.println("Массив отсортирован по возрастанию!");
    }

    public void sortDesc() {
        for (int i = size - 1; i >= 0; i--) {
            for (int j = i; j < size - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println();
        System.out.println("Массив отсортирован по убыванию!");
    }

    public void binarySearch(int numb) {
        int first = 0;
        int last = size - 1;
        int middle = (first + last) / 2;

        while (first <= last) {
            if (this.arr[middle] < numb) {
                first = middle + 1;
            } else if (this.arr[middle] == numb) {
                System.out.println();
                System.out.printf("Число %s найдено в массиве под индексом: %s", numb, middle);
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        if (first > last) {
            System.out.println();
            System.out.printf("Число %s в массиве отсутствует", numb);
        }
    }

    public int binarySearchOut(int numb) {
        int first = 0;
        int last = size - 1;
        int middle = (first + last) / 2;

        while (first <= last) {
            if (this.arr[middle] < numb) {
                first = middle + 1;
            } else if (this.arr[middle] == numb) {
                return middle;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        return -1;
    }

    public void changeNumber(int oldN, int newN) {
        int index = binarySearchOut(oldN);
        if(index == -1){
            System.out.println();
            System.out.printf("Число %s в массиве отсутствует", oldN);
        }else{
            this.arr[index] = newN;
            System.out.println();
            System.out.printf("Старое число %s заменено в массиве на новое число %s!", oldN, newN);
            System.out.println();
        }
    }

    public void print() {
        System.out.println("Вывод массива:");
        for (int i = 0; i < size; i++) {
            System.out.print(this.arr[i]);
            System.out.print(" ");
        }
    }
}
