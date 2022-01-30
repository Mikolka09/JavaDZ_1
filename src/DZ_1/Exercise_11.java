package DZ_1;

import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину линии: ");
        int lens = scanner.nextInt();
        System.out.print("Укажите направление линии: \n" +
                "\t1.Вертикально\n\t2.Горизонтально");
        System.out.print("Ваш выбор: ");
        int var = scanner.nextInt();
        if (var == 1) {
            System.out.print("Каким символом вывести линию: ");
            String chr = scanner.next();
            for (int i = 0; i < lens; i++)
                System.out.println(chr);
        } else if (var == 2) {
            System.out.print("Каким символом вывести линию: ");
            String chr = scanner.next();
            for (int i = 0; i < lens; i++)
                System.out.print(chr);
        } else
            System.out.println("Вы ввели неправельный выбор направления линии!");
    }
}
