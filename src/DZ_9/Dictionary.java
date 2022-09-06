package DZ_9;


import lombok.Data;

import java.util.*;

@Data
public class Dictionary {
    TreeMap<String, ArrayList<String>> dictionary;
    ArrayList<World> worlds;
    Scanner scan = new Scanner(System.in);

    public void insert() {
        try {
            System.out.println("\nНачальный ввод данных в словарь");
            boolean bool = true;
            if (this.dictionary == null) {
                this.dictionary = new TreeMap<>();
                this.worlds = new ArrayList<>();
            }
            while (bool) {
                System.out.print("\nВведите слово на английском: ");
                String str = scan.nextLine();
                if (!equalsWorld(str)) {
                    World world = new World(str, 0);
                    this.worlds.add(world);
                    System.out.print("Введите варианты перевода на русском через пробел: ");
                    String[] get = scan.nextLine().split(" ");
                    ArrayList<String> worlds = new ArrayList<>(Arrays.asList(get));
                    this.dictionary.put(str, worlds);
                    System.out.println("Слово добавлено!");
                    System.out.print("\nХотите добавить еще одно слово (1-Да, 2-Нет): ");
                    int res = Integer.parseInt(scan.nextLine());
                    switch (res) {
                        case 1 -> {
                        }
                        case 2 -> bool = false;
                        default -> throw new IllegalStateException("Unexpected value: " + res);
                    }
                } else {
                    System.out.println("\nТакое слово уже есть в словаре! Попробуйте еще раз!");
                }
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public boolean equalsWorld(String str) {
        for (World w : this.worlds) {
            if (Objects.equals(w.name, str))
                return true;
        }
        return false;
    }

    public void addTranslateWorld() {
        try {
            System.out.println("\nДобавить слово к переводу");
            boolean bool = true;
            while (bool) {
                System.out.print("\nВведите английское слово: ");
                String str = scan.nextLine();
                if (equalsWorld(str)) {
                    counter(str);
                    print(str, this.dictionary.get(str));
                    System.out.print("\nВведите еще один вариант перевода: ");
                    String sl = scan.nextLine();
                    this.dictionary.get(str).add(sl);
                    System.out.println("Слово добавлено!");
                    print(str, this.dictionary.get(str));
                    System.out.print("\nХотите добавить еще одно слово перевода (1-Да, 2-Нет): ");
                    int res = Integer.parseInt(scan.nextLine());
                    switch (res) {
                        case 1 -> {
                        }
                        case 2 -> bool = false;
                        default -> throw new IllegalStateException("Unexpected value: " + res);
                    }
                } else {
                    System.out.println("\nТакого слова нет в словаре! Попробуйте еще раз!");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void changeTranslateWorld() {
        try {
            System.out.println("\nЗаменить слово к переводу");
            boolean bool = true;
            while (bool) {
                System.out.print("\nВведите английское слово: ");
                String str = scan.nextLine();
                if (equalsWorld(str)) {
                    counter(str);
                    print(str, this.dictionary.get(str));
                    System.out.print("\nУкажите порядок (номер) слова, которое надо заменить: ");
                    int ind = Integer.parseInt(scan.nextLine()) - 1;
                    System.out.print("\nВведите новый вариант перевода для замены: ");
                    String st = scan.nextLine();
                    this.dictionary.get(str).set(ind, st);
                    System.out.println("Слово заменено!");
                    print(str, this.dictionary.get(str));
                    System.out.print("\nХотите заменить еще одно слово перевода (1-Да, 2-Нет): ");
                    int res = Integer.parseInt(scan.nextLine());
                    switch (res) {
                        case 1 -> {
                        }
                        case 2 -> bool = false;
                        default -> throw new IllegalStateException("Unexpected value: " + res);
                    }
                } else {
                    System.out.println("\nТакого слова нет в словаре! Попробуйте еще раз!");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void deleteTranslateWorld() {
        try {
            System.out.println("\nУдалить слово к переводу");
            boolean bool = true;
            while (bool) {
                System.out.print("\nВведите английское слово: ");
                String str = scan.nextLine();
                if (equalsWorld(str)) {
                    counter(str);
                    print(str, this.dictionary.get(str));
                    System.out.print("\nУкажите порядок (номер) слова, которое надо удалить: ");
                    int ind = Integer.parseInt(scan.nextLine()) - 1;
                    this.dictionary.get(str).remove(ind);
                    System.out.println("Слово удалено!");
                    print(str, this.dictionary.get(str));
                    System.out.print("\nХотите удалить еще одно слово перевода (1-Да, 2-Нет): ");
                    int res = Integer.parseInt(scan.nextLine());
                    switch (res) {
                        case 1 -> {
                        }
                        case 2 -> bool = false;
                        default -> throw new IllegalStateException("Unexpected value: " + res);
                    }
                } else {
                    System.out.println("\nТакого слова нет в словаре! Попробуйте еще раз!");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void addWorld() {
        insert();
    }

    public void changeWorld() {
        try {
            System.out.println("\nЗаменить слово в словаре");
            boolean bool = true;
            while (bool) {
                System.out.print("\nВведите английское слово: ");
                String str = scan.nextLine();
                if (equalsWorld(str)) {
                    counter(str);
                    print(str, this.dictionary.get(str));
                    System.out.print("\nВведите новый вариант иностранного слова: ");
                    String st = scan.nextLine();
                    int index = 0;
                    World newWorld = new World("", 0);
                    for (World w : this.worlds) {
                        if (Objects.equals(w.name, str)) {
                            index = this.worlds.indexOf(w);
                            newWorld.name = st;
                            newWorld.count = w.count;
                        }
                    }
                    this.worlds.set(index, newWorld);
                    ArrayList<String> newList = this.dictionary.get(str);
                    this.dictionary.remove(str);
                    this.dictionary.put(st, newList);
                    System.out.println("Иностранное слово заменено!");
                    print(st, this.dictionary.get(st));
                    System.out.print("\nХотите заменить еще одно иностранное слово (1-Да, 2-Нет): ");
                    int res = Integer.parseInt(scan.nextLine());
                    switch (res) {
                        case 1 -> {
                        }
                        case 2 -> bool = false;
                        default -> throw new IllegalStateException("Unexpected value: " + res);
                    }
                } else {
                    System.out.println("\nТакого слова нет в словаре! Попробуйте еще раз!");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void deleteWorld() {
        try {
            System.out.println("\nУдалить слово из словаря");
            boolean bool = true;
            while (bool) {
                System.out.print("\nВведите английское слово: ");
                String str = scan.nextLine();
                if (equalsWorld(str)) {
                    print(str, this.dictionary.get(str));
                    int index = 0;
                    for (World w : this.worlds) {
                        if (Objects.equals(w.name, str)) {
                            index = this.worlds.indexOf(w);
                        }
                    }
                    System.out.print("\nХотите удалить это иностранное слово (1-Да, 2-Нет): ");
                    int var = Integer.parseInt(scan.nextLine());
                    if (var == 1) {
                        this.worlds.remove(index);
                        this.dictionary.remove(str);
                        System.out.println("Иностранное слово удалено!");
                        System.out.print("\nХотите удалить еще одно иностранное слово (1-Да, 2-Нет): ");
                        int res = Integer.parseInt(scan.nextLine());
                        switch (res) {
                            case 1 -> {
                            }
                            case 2 -> bool = false;
                            default -> throw new IllegalStateException("Unexpected value: " + res);
                        }
                    } else {
                        bool = false;
                    }
                } else {
                    System.out.println("\nТакого слова нет в словаре! Попробуйте еще раз!");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void Top10PopularWords() {
        try {
            boolean bool = true;
            while (bool) {
                System.out.println("\nВывод Top10 самых популярных слов\n");
                this.worlds.sort(Comparator.comparing(World::getCount).reversed());
                System.out.println("\t№\tСЛОВО\tКОЛ-ВО");
                int i = 1;
                for (World w : this.worlds) {
                    if (i < 11) {
                        System.out.println("\t" + i + "\t" + w.name + "\t" + w.count);
                        i++;
                    } else {
                        break;
                    }
                }
                System.out.print("\nЧтобы продолжить нажмите - '1': ");
                int var = Integer.parseInt(scan.nextLine());
                if (var == 1) bool = false;
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void Top10UnPopularWords() {
        try {
            boolean bool = true;
            while (bool){
                System.out.println("\nВывод Top10 самых непопулярных слов\n");
                this.worlds.sort(Comparator.comparing(World::getCount));
                System.out.println("\t№\tСЛОВО\tКОЛ-ВО");
                int i = 1;
                for (World w : this.worlds) {
                    if (i < 11) {
                        System.out.println("\t" + i + "\t" + w.name + "\t" + w.count);
                        i++;
                    } else {
                        break;
                    }
                }
                System.out.print("\nЧтобы продолжить нажмите - '1': ");
                int var = Integer.parseInt(scan.nextLine());
                if (var == 1) bool = false;
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void printWorlds() {
        try {
            System.out.println("\nВывод иностранного слова с переводами");
            boolean bl = true;
            while (bl) {
                System.out.print("\nВведите английское слово: ");
                String str = scan.nextLine();
                if (equalsWorld(str)) {
                    counter(str);
                    print(str, this.dictionary.get(str));
                    System.out.print("\nХотите просмотреть еще одно слово (1-Да, 2-Нет): ");
                    int res = Integer.parseInt(scan.nextLine());
                    switch (res) {
                        case 1 -> {
                        }
                        case 2 -> bl = false;
                        default -> throw new IllegalStateException("Unexpected value: " + res);
                    }
                } else {
                    System.out.println("\nТакого слова нет в словаре! Попробуйте еще раз!");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void print(String str, ArrayList<String> worlds) {
        try {
            System.out.printf("\nСлово - '%s' имеет переводы:\n", str);
            int i = 1;
            for (String st : worlds) {
                System.out.println("\t\t" + i + ". " + st);
                i++;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void counter(String str) {
        for (World w : this.worlds) {
            if (Objects.equals(w.name, str))
                w.count++;
        }
    }
}
