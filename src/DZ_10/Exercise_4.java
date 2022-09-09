package DZ_10;

import java.util.Scanner;

//Проверка на равенство конкретному числу
interface Operation_11 {
    boolean equalityNumb(int a);
}

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Проверка на равенство конкретному числу
        System.out.print("\nВведите число для сравнения: ");
        int b = Integer.parseInt(scanner.nextLine());
        Operation_11 op_11 = a -> {
            if (a == b) {
                return true;
            } else {
                return false;
            }
        };
        int[] arr = {12, 3, 5, 8, 5, 3, 5, 8, 8, 10, 5, 12, 3};
        System.out.println("Сумма элементов задание 1 равна : " + sum(arr, op_11));

        //Число не находится в диапазоне от А до В
        System.out.print("\nВведите числой диапазон через пробел: ");
        String[] str = scanner.nextLine().split(" ");
        int start = Integer.parseInt(str[0]);
        int finish = Integer.parseInt(str[1]);
        Operation_11 op_12 = x -> {
            for (int i = start; i <= finish; i++) {
                if (x == i) {
                    return false;
                }
            }
            return true;
        };
        System.out.println("Сумма элементов задание 2 равна: " + sum(arr, op_12));

        //Проверка на положительность числа
        Operation_11 op_13 = x -> {
            if (x > 0) {
                return true;
            } else {
                return false;
            }
        };
        int[] arr3 = {12, -3, 5, 8, -5, 3, 5, -8, 8, 10, 5, 12, -3};
        System.out.println("Сумма положительных элементов задание 3 равна : " + sum(arr3, op_13));

        //Проверка на отрицательность числа
        Operation_11 op_14 = x -> {
            if (x < 0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println("Сумма отрицательных элементов задание 4 равна : " + sum(arr3, op_14));
    }

    private static int sum(int[] arr, Operation_11 op_11) {
        int sum = 0;
        for (int numb : arr) {
            if (op_11.equalityNumb(numb)) {
                sum += numb;
            }
        }
        return sum;
    }
}
