package DZ_12.Exercise_4;

import java.util.Scanner;

public class Main {
    static MyThreadSearch myThreadSearch;
    static MyThreadChange myThreadChange;
    public static void main(String[] args) throws InterruptedException {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите путь к каталогу с файлами: ");
            String path = scan.nextLine();
            System.out.print("Введите запрещенное слово: ");
            String world = scan.nextLine();
            String pathNew = "d:\\result.txt";
            myThreadSearch = new MyThreadSearch("Search");
            myThreadChange = new MyThreadChange("Change");
            myThreadSearch.path = path;
            myThreadSearch.savePath = pathNew;
            myThreadSearch.world = world;
            myThreadChange.savePath = pathNew;
            myThreadChange.world = world;
            myThreadSearch.start();
            myThreadSearch.join();
            myThreadChange.start();
            myThreadChange.join();

            System.out.println("FINISH");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
