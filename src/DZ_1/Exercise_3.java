package DZ_1;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int x1 = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int x2 = scanner.nextInt();
        System.out.print("Введите третье целое число: ");
        int x3 = scanner.nextInt();
        System.out.print("Результат: " + x1 + x2 + x3);

    }
}
