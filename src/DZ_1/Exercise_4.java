package DZ_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.swap;

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите шестизначное число: ");
        String[] numb = scanner.next().split("");
        if (numb.length == 6) {
            List<String> arr = Arrays.asList(numb);
            swap(arr, 0, 5);
            swap(arr, 1, 4);
            String str = String.join("", numb);
            System.out.print("Результат: " + str);
        } else
            System.out.println("Вы ввели неправильное число!");


    }
}
