package DZ_1;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int numb = scanner.nextInt();
        System.out.print("Введите процент: ");
        int proc = scanner.nextInt();
        System.out.println("Результат: " + (numb * proc) / 100);
    }
}
