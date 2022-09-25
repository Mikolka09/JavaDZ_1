package DZ_13.Exercise_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) {
        try {
            ArrayList<Projector> projectors = new ArrayList<>();
            projectors.add(new Projector("Ultra", 2020, 14000, "IBM"));
            projectors.add(new Projector("Super", 2021, 15000, "Apple"));
            projectors.add(new Projector("First", 2018, 12500, "Nokia"));
            projectors.add(new Projector("Second", 2020, 13000, "Bind"));
            projectors.add(new Projector("High", 2022, 18000, "Mobil"));
            projectors.add(new Projector("Disco", 2019, 16000, "MMK"));
            projectors.add(new Projector("Second_2", 2021, 13500, "Bind"));
            projectors.add(new Projector("High_2", 2022, 18500, "Mobil"));
            projectors.add(new Projector("Disco_2", 2020, 16500, "MMK"));
            System.out.println("Вывод всех проэкторов: ");
            projectors.forEach(x -> System.out.println(x.toString()));
            System.out.println();
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите название производителя: ");
            String name = scan.nextLine();
            System.out.printf("\nВвывод всех проэкторов производителя '%s': ", name.toUpperCase());
            System.out.println();
            projectors.stream().filter(x -> Objects.equals(x.manufacturer.toUpperCase(), name.toUpperCase())).
                    forEach(System.out::println);
            System.out.println("\nВвывод всех проэкторов 2022 года: ");
            System.out.println();
            projectors.stream().filter(x -> x.date == 2022).forEach(System.out::println);
            System.out.print("\nВведите стоимость проэктора: ");
            int pr = Integer.parseInt(scan.nextLine());
            System.out.printf("\nВвывод всех проэкторов стоимостью более %s: ", pr);
            System.out.println();
            projectors.stream().filter(x -> x.price > pr).forEach(System.out::println);
            System.out.println("\nВывод всех проэкторов отсортированные по цене по возростанию: ");
            projectors.stream().sorted(Comparator.comparingInt(Projector::getPrice)).
                    forEach(System.out::println);
            System.out.println("\nВывод всех проэкторов отсортированные по цене по убыванию: ");
            projectors.stream().sorted(Comparator.comparingInt(Projector::getPrice).reversed()).
                    forEach(System.out::println);
            System.out.println("\nВывод всех проэкторов отсортированные по году по возростанию: ");
            projectors.stream().sorted(Comparator.comparingInt(Projector::getDate)).
                    forEach(System.out::println);
            System.out.println("\nВывод всех проэкторов отсортированные по году по убыванию: ");
            projectors.stream().sorted(Comparator.comparingInt(Projector::getDate).reversed()).
                    forEach(System.out::println);

            System.out.println("\nFINISH");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
