package DZ_11.Exercise_5;

import java.util.Scanner;

public class ModelCorporation implements Runnable {
    Corporation corp = new Corporation();
    Scanner scan = new Scanner(System.in);

    public void start() {
        this.corp.loadListEmployees();
        try {
            System.out.println("\n\n\tWelcome to my Corporation!");

            while (true) {
                System.out.println("\n\t\tMENU");
                System.out.println("""
                        \t1. Добавление нового сотрудника
                        \t2. Редактирование данных сотрудника
                        \t3. Удаление сотрудника
                        \t4. Поиск сотрудника по фамилии
                        \t5. Вывод информации обо всех сотрудниках                   
                        \t6. Выход""");
                System.out.print("\nВаш выбор: ");
                int var = Integer.parseInt(scan.nextLine());
                switch (var) {
                    case 1 -> this.corp.addEmployee();
                    case 2 -> this.corp.editEmployee();
                    case 3 -> this.corp.deleteEmployee();
                    case 4 -> this.corp.findEmployee();
                    case 5 -> printFindEmployees();
                    default -> System.exit(0);
                }

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void printFindEmployees() {
        try {
            while (true) {
                System.out.println("\n\t\tВывод информации о сотрудниках");
                System.out.println("""
                        \t1. Вывод информации обо всех сотрудниках
                        \t2. Вывод информации обо всех сотрудниках определенного возраста
                        \t3. Вывод информации обо всех сотрудниках по букве фамилии                                                                 
                        \t4. Выход""");
                System.out.print("\nВаш выбор: ");
                int var = Integer.parseInt(scan.nextLine());
                switch (var) {
                    case 1 -> this.corp.printEmployees();
                    case 2 -> this.corp.printAgeEmployees();
                    case 3 -> this.corp.printNameEmployees();
                    default -> start();
                }

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    @Override
    public void run() {
        start();
    }
}
