package DZ_12.Exercise_3;

import java.util.Scanner;

public class Main {
    static MyThreadCopy myThreadCopy;

    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите путь к каталогу с файлами: ");
        String pathOld = scan.nextLine();
        System.out.print("Введите путь к каталогу куда скопировать файлы: ");
        String pathNew = scan.nextLine();
        myThreadCopy = new MyThreadCopy("Copy");
        myThreadCopy.pathNew = pathNew;
        myThreadCopy.pathOld = pathOld;
        myThreadCopy.start();
        myThreadCopy.join();
        System.out.println("Было скопировано файлов и папок: " + myThreadCopy.count);
        System.out.println("FINISH");
    }
}
