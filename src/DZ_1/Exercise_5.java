package DZ_1;

import java.util.Scanner;

public class Exercise_5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int numb=scanner.nextInt();
        switch (numb){
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Вы ввели неверный номер месяца!");
        }
    }
}
