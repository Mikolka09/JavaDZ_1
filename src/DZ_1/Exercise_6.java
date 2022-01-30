package DZ_1;

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во метров: ");
        int mt = scanner.nextInt();
        System.out.print("В какую единицу измерения перевести:\n" +
                "\t1.Мили\n" + "\t2.Дюймы\n" + "\t3.Ярды\n");
        System.out.print("Ваш выбор: ");
        int vib = scanner.nextInt();
        switch (vib) {
            case 1:
                System.out.println("Кол-во миль: " + (mt / 1609f));
                break;
            case 2:
                System.out.println("Кол-во дюймов: " + (mt / 39.37f));
                break;
            case 3:
                System.out.println("Кол-во ярдов: " + (mt / 1.094f));
                break;
        }
    }
}
