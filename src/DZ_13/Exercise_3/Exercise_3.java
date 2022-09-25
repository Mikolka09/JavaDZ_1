package DZ_13.Exercise_3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        try {
            ArrayList<Device> device = new ArrayList<>();
            device.add(new Device("Phone", 2014, 1500, "white", "monoblock"));
            device.add(new Device("TV", 2018, 3500, "black", "LCD"));
            device.add(new Device("Notebook", 2019, 5500, "red", "ultra"));
            device.add(new Device("Scouter", 2020, 7500, "black", "electron"));
            device.add(new Device("Tablet", 2019, 1800, "white", "ultra"));
            device.add(new Device("Tablet", 2020, 2000, "black", "ultra"));
            device.add(new Device("Scouter", 2020, 7500, "black", "electron"));
            device.add(new Device("Notebook", 2021, 6500, "brown", "ultra"));
            device.add(new Device("Scouter", 2018, 5800, "yellow", "electron"));
            System.out.println("Вывод всех Устройств:");
            device.forEach(x -> System.out.println(x.toString()));
            Scanner scan = new Scanner(System.in);
            System.out.print("\nВведите цвет устройства: ");
            String col = scan.nextLine();
            System.out.printf("\nВвывод всех устройств цветом %s: ", col.toUpperCase());
            System.out.println();
            device.stream().filter(x -> Objects.equals(x.color.toUpperCase(), col.toUpperCase())).
                    forEach(System.out::println);
            System.out.print("\nВведите год выпуска: ");
            int dat = Integer.parseInt(scan.nextLine());
            System.out.printf("\nВвывод всех устройств годом выпуска %s: ", dat);
            System.out.println();
            device.stream().filter(x -> x.date == dat).forEach(System.out::println);
            System.out.print("\nВведите стоимость устройства: ");
            int pr = Integer.parseInt(scan.nextLine());
            System.out.printf("\nВвывод всех устройств стоимостью более %s: ", pr);
            System.out.println();
            device.stream().filter(x -> x.price > pr).forEach(System.out::println);
            System.out.print("\nВведите тип устройства: ");
            String tp = scan.nextLine();
            System.out.printf("\nВвывод всех устройств типом %s: ", tp.toUpperCase());
            System.out.println();
            device.stream().filter(x -> Objects.equals(x.type.toUpperCase(), tp.toUpperCase())).
                    forEach(System.out::println);
            System.out.print("\nВведите диапозон года выпуска через пробел: ");
            String[] str = scan.nextLine().split(" ");
            int[] dr = new int[str.length];
            dr[0] = Integer.parseInt(str[0]);
            dr[1] = Integer.parseInt(str[1]);
            System.out.printf("\nВвывод всех устройств годом выпуска в диапазоне от %s до %s: ", dr[0], dr[1]);
            System.out.println();
            device.stream().filter(x -> x.date >= dr[0] && x.date <= dr[1]).forEach(System.out::println);


            System.out.println("\nFINISH");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }
}
