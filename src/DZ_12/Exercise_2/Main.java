package DZ_12.Exercise_2;

import java.util.Scanner;

public class Main {
    static MyThreadRandom myThreadRandom;
    static MyThreadSimple myThreadSimple;
    static MyThreadFactorial myThreadFactorial;

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String path = scan.nextLine();
        myThreadRandom = new MyThreadRandom("Random");
        myThreadSimple = new MyThreadSimple("Simple");
        myThreadFactorial = new MyThreadFactorial("Factorial");
        myThreadRandom.path = path;
        myThreadRandom.start();
        myThreadRandom.join();
        myThreadSimple.pathRead = path;
        myThreadFactorial.pathRead = path;
        myThreadSimple.start();
        myThreadFactorial.start();
        myThreadSimple.join();
        myThreadFactorial.join();
        System.out.println("Простые числа:");
        for (int a : myThreadSimple.result) {
            System.out.print(a + " ");
        }

        System.out.println("\nФакториал каждого числа:");
        for (int a : myThreadFactorial.result) {
            System.out.print(a + " ");
        }
        System.out.println("\nFINISH");

    }
}
