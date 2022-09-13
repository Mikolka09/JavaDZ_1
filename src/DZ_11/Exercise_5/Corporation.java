package DZ_11.Exercise_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Corporation {
    ArrayList<Employee> employees = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void addEmployee() {
        System.out.println("Добавление нового сотрудника:\n");
        try {
            System.out.print("Введите Имя сотрудника: ");
            String firstName = scan.nextLine();
            System.out.print("\nВведите Фамилию сотрудника: ");
            String lastName = scan.nextLine();
            System.out.print("\nВведите Должность сотрудника: ");
            String job = scan.nextLine();
            System.out.print("\nВведите Отдел работы сотрудника: ");
            String depart = scan.nextLine();
            System.out.print("\nВведите Возраст сотрудника: ");
            int age = Integer.parseInt(scan.nextLine());
            this.employees.add(new Employee(firstName, lastName, job, depart, age));
            System.out.println("\nНовый сотрудник добавлен!");
            saveListEmployees();
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
    }

    public void editEmployee() {
        System.out.println("Редактирование данных сотрудника:\n");
        try {
            System.out.print("\nВведите Фамилию сотрудника для поиска: ");
            String lastName = scan.nextLine();
            int index = findEmployee(lastName);
            Employee findEmp = employees.get(index);
            System.out.println("Сотрудник по фамили " + lastName + " найден:\n");
            findEmp.print();
            boolean proc = true;
            while (proc) {
                System.out.println("\nКакие данные надо изменить:\n1.Имя\n2.Фамилию" +
                        "\n3.Должность\n4.Отдел\n5.Возраст\n6.Выход");
                System.out.print("\nВаш выбор: ");
                int var = Integer.parseInt(scan.nextLine());
                switch (var) {
                    case 1:
                        System.out.print("\nВведите новое Имя сотрудника: ");
                        String newfirstName = scan.nextLine();
                        findEmp.setLastName(newfirstName);
                        employees.set(index, findEmp);
                        System.out.println("\nФамилия сотрудика изменена!\n");
                        findEmp.print();
                        Thread.sleep(500);
                        saveListEmployees();
                        break;
                    case 2:
                        System.out.print("\nВведите новую Фамилию сотрудника: ");
                        String newlastName = scan.nextLine();
                        findEmp.setLastName(newlastName);
                        employees.set(index, findEmp);
                        System.out.println("\nФамилия сотрудика изменена!\n");
                        findEmp.print();
                        Thread.sleep(500);
                        saveListEmployees();
                        break;
                    case 3:
                        System.out.print("\nВведите новую Должность сотрудника: ");
                        String newJob = scan.nextLine();
                        findEmp.setLastName(newJob);
                        employees.set(index, findEmp);
                        System.out.println("\nДолжность сотрудика изменена!\n");
                        findEmp.print();
                        Thread.sleep(500);
                        saveListEmployees();
                        break;
                    case 4:
                        System.out.print("\nВведите новый Отдел сотрудника: ");
                        String newDepart = scan.nextLine();
                        findEmp.setLastName(newDepart);
                        employees.set(index, findEmp);
                        System.out.println("\nОтдел сотрудика изменен!\n");
                        findEmp.print();
                        Thread.sleep(500);
                        saveListEmployees();
                        break;
                    case 5:
                        System.out.print("\nВведите новый Возраст сотрудника: ");
                        String newAge = scan.nextLine();
                        findEmp.setLastName(newAge);
                        employees.set(index, findEmp);
                        System.out.println("\nВозраст сотрудика изменен!\n");
                        findEmp.print();
                        Thread.sleep(500);
                        saveListEmployees();
                        break;
                    default:
                        proc = false;
                        break;
                }
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void deleteEmployee() {
        System.out.println("Удаление сотрудника:\n");
        try {
            System.out.print("\nВведите Фамилию сотрудника для удаления: ");
            String lastName = scan.nextLine();
            int index = findEmployee(lastName);
            System.out.print("\nВы точно желаете удалить сотрудника (Да-1, Нет-2): ");
            int var = Integer.parseInt(scan.nextLine());
            if(var==1){
                this.employees.remove(index);
                System.out.println("\nСотрудник удален!\n");
                Thread.sleep(500);
                saveListEmployees();
            }else {
                System.out.println("\nВовзрат в начальое меню\n");
                Thread.sleep(500);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public int findEmployee(String lastName) {
        System.out.println("Поиск сотрудника по фамилии:\n");
        try {
            return 0;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return -1;
    }

    public void printEmployees() {
        System.out.println("\tFirstName\tLastName\tJob\tDepartment\tAge");
        try {

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveListEmployees() {
        try {

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void loadListEmployees() {
        try {

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveFindInformation() {
        try {

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
