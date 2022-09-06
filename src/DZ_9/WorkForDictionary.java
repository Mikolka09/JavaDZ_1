package DZ_9;

import java.io.IOException;
import java.util.*;

public class WorkForDictionary implements Runnable {

    Dictionary dict = new Dictionary();
    Scanner scan = new Scanner(System.in);

    private void startWork() throws InterruptedException, IOException {
        try {
            System.out.println("\n\n\n\tWelcome to my Dictionary!\n");
            System.out.println("\t\t Please wait");
            System.out.print("\t  ");
            for (int i = 0; i < 9; i++) {
                System.out.print("* ");
                Thread.sleep(200);
            }

            while (true) {
                System.out.println("\n\n\t\tMENU");
                System.out.println("""
                        \t1. Начальный ввод данных
                        \t2. Вывод слова и перевод
                        \t3. Работа с переводами слова
                        \t4. Работа с иностранным словом
                        \t5. Топ-10 самых популярных слов
                        \t6. Топ-10 самых непопулярных слов
                        \t7. Выход""");
                System.out.print("\nВаш выбор: ");
                int var = Integer.parseInt(scan.nextLine());
                switch (var) {
                    case 1 -> this.dict.insert();
                    case 2 -> this.dict.printWorlds();
                    case 3 -> workForTranslateWorld();
                    case 4 -> workForWorld();
                    case 5 -> this.dict.Top10PopularWords();
                    case 6 -> this.dict.Top10UnPopularWords();
                    default -> System.exit(0);
                }

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    private void workForTranslateWorld() {
        try {
            boolean bool = true;
            while (bool) {
                System.out.println("\nРабота с переводами слова");
                System.out.println("\n\n\t\tMENU");
                System.out.println("""
                        \t1. Добавить перевод
                        \t2. Заменить перевод
                        \t3. Удалить перевод
                        \t4. Выход""");
                System.out.print("\nВаш выбор: ");
                int var = Integer.parseInt(scan.nextLine());
                switch (var) {
                    case 1 -> this.dict.addTranslateWorld();
                    case 2 -> this.dict.changeTranslateWorld();
                    case 3 -> this.dict.deleteTranslateWorld();
                    default -> bool = false;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void workForWorld() {
        try {
            boolean bool = true;
            while (bool) {
                System.out.println("\nРабота с иностранным словом");
                System.out.println("\n\n\t\tMENU");
                System.out.println("""
                        \t1. Добавить слово
                        \t2. Заменить слово
                        \t3. Удалить слово
                        \t4. Выход""");
                System.out.print("\nВаш выбор: ");
                int var = Integer.parseInt(scan.nextLine());
                switch (var) {
                    case 1 -> this.dict.addWorld();
                    case 2 -> this.dict.changeWorld();
                    case 3 -> this.dict.deleteWorld();
                    default -> bool = false;
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void run() {
        try {
            startWork();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}
