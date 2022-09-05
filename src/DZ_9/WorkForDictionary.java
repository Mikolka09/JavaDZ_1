package DZ_9;


import java.io.IOException;
import java.util.*;

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
        boolean bool = true;
        while (bool)
        {
            System.out.println("\nРабота с переводами слова");
            System.out.println("\n\n\t\tMENU");
            System.out.println("""
                \t1. Добавить перевод
                \t2. Заменить перевод
                \t3. Удалить перевод
                \t4. Выход""");
            System.out.print("\nВаш выбор: ");
            int var = Integer.parseInt(scan.nextLine());
            switch (var){
                case 1 -> addTranslateWorld();
                case 2 -> changeTranslateWorld();
                case 3 -> deleteTranslateWorld();
                default -> bool = false;
            }
        }

    }

    private void addTranslateWorld(){
        System.out.println("\nДобавить слово к переводу");
        boolean bool = true;
        while (bool)
        {
            System.out.print("\nВведите английское слово: ");
            String str = scan.nextLine();
            print(str, this.dict.dictionary.get(str));
            System.out.print("\nВведите еще один вариант перевода: ");
            String sl = scan.nextLine();
            this.dict.dictionary.get(str).add(sl);
            System.out.println("Слово добавлено!");
            print(str, this.dict.dictionary.get(str));
            System.out.print("\nХотите добавить еще одно слово перевода (1-Да, 2-Нет): ");
            int res = Integer.parseInt(scan.nextLine());
            switch (res) {
                case 1 -> {
                }
                case 2 -> bool = false;
                default -> throw new IllegalStateException("Unexpected value: " + res);
            }
        }

    }

    private void changeTranslateWorld(){

    }

    private void deleteTranslateWorld(){

    }



    private void workForWorld() {
        boolean bool = true;
        while (bool)
        {
            System.out.println("\nРабота с иностранным словом");
            System.out.println("\n\n\t\tMENU");
            System.out.println("""
                \t1. Добавить слово
                \t2. Заменить заменить
                \t3. Удалить слово
                \t4. Выход""");
            System.out.print("\nВаш выбор: ");
            int var = Integer.parseInt(scan.nextLine());
            switch (var){
                case 1 -> addWorld();
                case 2 -> changeWorld();
                case 3 -> deleteWorld();
                default -> bool = false;
            }
        }
    }

    private void addWorld(){

    }

    private void changeWorld(){

    }

    private void deleteWorld(){

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
            for(World w: this.dict.worlds){
                if(Objects.equals(w.name, str))
                    w.count++;
            }
            print(str, this.dict.dictionary.get(str));
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

    private void print(String str, ArrayList<String> worlds){
        System.out.printf("\nСлово - '%s' имеет переводы:\n", str);
        for (String st : worlds) {
            System.out.println("\t\t" + st);
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
