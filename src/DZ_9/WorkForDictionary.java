package DZ_9;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class WorkForDictionary implements Runnable {

    Dictionary dict = new Dictionary();
    Scanner scan = new Scanner(System.in);

    private void startWork() throws InterruptedException, IOException {
        System.out.println("\n\n\n\tWelcome to my Dictionary!\n");
        System.out.println("\t\t Please wait");
        System.out.print("\t  ");
        for (int i = 0; i < 9; i++) {
            System.out.print("* ");
            Thread.sleep(200);
        }

        while (true) {
            System.out.println("\n\n\t\tMENU");
            System.out.println("\t1. Начальный ввод данных\n\t2. Вывод слова и перпевод\n\t3. Работа с переводами слова" +
                    "\n\t4. Работа со словом.\n\t5. Топ-10 самых популярных слов.\n\t6. Топ-10 самых непопулярных слов" +
                    "\n\t7. Выход");
            System.out.print("\nВаш выбор: ");
            int var = Integer.parseInt(scan.nextLine());
            switch (var) {
                case 1 -> insertWorld();
                case 2 -> printWorlds();
                case 3 -> workForTranslateWorld();
                case 4 -> workForWorld();
                case 5 -> Top10PopularWords();
                case 6 -> Top10UnPopularWords();
                default -> System.exit(0);
            }

        }
    }

    private void insertWorld() {
        System.out.println("\nНачальный ввод данных в словарь");
        boolean bool = true;
        if (this.dict.dictionary == null) {
            this.dict.dictionary = new TreeMap<>();
            this.dict.worlds = new ArrayList<>();
        }
        while (bool) {
            System.out.print("\nВведите слово на английском: ");
            String str = scan.nextLine();
            World world = new World(str, 0);
            this.dict.worlds.add(world);
            System.out.print("Введите варианты перевода на русском через пробел: ");
            String[] get = scan.nextLine().split(" ");
            ArrayList<String> worlds = new ArrayList<>(Arrays.asList(get));
            this.dict.dictionary.put(str, worlds);
            System.out.println("Слово добавлено!");
            System.out.print("\nХотите добавить еще одно слово (1-Да, 2-Нет): ");
            int res = Integer.parseInt(scan.nextLine());
            switch (res) {
                case 1 -> {
                }
                case 2 -> bool = false;
                default -> throw new IllegalStateException("Unexpected value: " + res);
            }
        }

    }

    private void workForTranslateWorld() {

    }

    private void workForWorld() {

    }

    private void Top10PopularWords() {

    }

    private void Top10UnPopularWords() {

    }

    private void printWorlds() {
        System.out.println("\nВывод иностранного слова с переводами");
        boolean bl = true;
        while (bl){
            System.out.print("\nВведите английское слово: ");
            String str = scan.nextLine();
            System.out.printf("\nСлово - '%s' имеет переводы:\n", str);
            ArrayList<String> worlds = this.dict.dictionary.get(str);
            for (String st : worlds) {
                System.out.println("\t\t" + st);
            }
            System.out.print("\nХотите просмотреть еще одно слово (1-Да, 2-Нет): ");
            int res = Integer.parseInt(scan.nextLine());
            switch (res) {
                case 1 -> {
                }
                case 2 -> bl = false;
                default -> throw new IllegalStateException("Unexpected value: " + res);
            }
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
