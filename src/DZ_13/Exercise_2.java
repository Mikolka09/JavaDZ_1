package DZ_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        try {
            ArrayList<String> products = new ArrayList<>();
            products.add("Яблоко");
            products.add("Молоко");
            products.add("Картошка");
            products.add("Хлеб");
            products.add("Мука");
            products.add("Творог");
            products.add("Помидор");
            products.add("Яблоко");
            products.add("Мука");
            products.add("Кефир");
            products.add("Шоколад");
            products.add("Лук");
            products.add("Сметана");
            products.add("Огурец");
            products.add("Банан");
            products.add("Огурец");
            System.out.println("Вывод списка всех продуктов:");
            products.forEach(x -> System.out.print(x + " "));
            System.out.println();
            System.out.println("\nВывод списка всех продуктов меньше пяти букв:");
            products.stream().filter(x -> x.split("").length < 5).forEach(x -> System.out.print(x + " "));
            System.out.print("\n\nВведите название продукта: ");
            Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            int countName = (int) products.stream().filter(x -> Objects.equals(x.toUpperCase(), name.toUpperCase())).count();
            System.out.printf("Продукт по названием %s встречается: %s раза", name, countName);
            System.out.print("\n\nВведите начальную букву продукта: ");
            String st = scan.nextLine();
            System.out.printf("Вывод списка всех продуктов начинающихся на букву %s:", st.toUpperCase());
            System.out.println();
            products.stream().filter(x -> x.split("")[0].equalsIgnoreCase(st)).forEach(x -> System.out.print(x + " "));
            System.out.println("\n\nВывод списка всех продуктов из котегории 'Молоко':");
            String[] prod = {"Молоко", "Творог", "Кефир", "Сметана"};
            products.stream().filter(x -> {
                for (String s : prod) {
                    if (Objects.equals(x.toUpperCase(), s.toUpperCase())) {
                        return true;
                    }
                }
                return false;
            }).forEach(x -> System.out.print(x + " "));

            System.out.println("\nFINISH");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
