package DZ_1;

import java.util.Scanner;

public class Exercise_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое целое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе целое число: ");
        int b = scanner.nextInt();
        if (a < b) {
            for (int i = a; i <= b; i++) {
                for (int j = 1; j <= 10; j++)
                    System.out.print(i + "*" + j + " = " + i * j + "  ");
                System.out.print("\n\n");
            }
        }else if(a>b){
            for (int i = b; i <= a; i++) {
                for (int j = 1; j <= 10; j++)
                    System.out.print(i + "*" + j + " = " + i * j + "  ");
                System.out.print("\n\n");
            }
        }
    }
}
