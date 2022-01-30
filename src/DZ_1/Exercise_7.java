package DZ_1;

import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int b = scanner.nextInt();
        if (a < b) {
            System.out.print("Все нечетные числа в диапазоне от " + a + " до " + b + ": ");
            for (int i = a; i < b; i++) {
                if (i % 2 != 0)
                    System.out.print(i + " ");
            }
        } else if (a > b) {
            System.out.print("Все нечетные числа в диапазоне от " + b + " до " + a + ": ");
            for (int i = b; i < a; i++) {
                if (i % 2 != 0)
                    System.out.print(i + " ");
            }
        } else if (a % 2 != 0)
            System.out.print("Нечетное число: " + a);
        else
            System.out.print("Нечетных чисел нет!");
    }
}
