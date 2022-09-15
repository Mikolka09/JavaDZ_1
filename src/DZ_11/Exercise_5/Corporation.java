package DZ_11.Exercise_5;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Corporation implements Serializable {
    ArrayList<Employee> employees = new ArrayList<>();
    String path = "d:\\Users\\MIKOLKA\\JavaDZ\\DZ_1\\src\\DZ_11\\Exercise_5\\file_5.bin";
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
            int index = findIndexEmployee(lastName);
            if (index < 0) {
                System.out.println("Сотрудника с такой фамилие не существует. Попробуйте еще раз!");
            } else {
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
                            findEmp.setFirstName(newfirstName);
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
                            findEmp.setJob(newJob);
                            employees.set(index, findEmp);
                            System.out.println("\nДолжность сотрудика изменена!\n");
                            findEmp.print();
                            Thread.sleep(500);
                            saveListEmployees();
                            break;
                        case 4:
                            System.out.print("\nВведите новый Отдел сотрудника: ");
                            String newDepart = scan.nextLine();
                            findEmp.setDepartment(newDepart);
                            employees.set(index, findEmp);
                            System.out.println("\nОтдел сотрудика изменен!\n");
                            findEmp.print();
                            Thread.sleep(500);
                            saveListEmployees();
                            break;
                        case 5:
                            System.out.print("\nВведите новый Возраст сотрудника: ");
                            int newAge = Integer.parseInt(scan.nextLine());
                            findEmp.setAge(newAge);
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
            int index = findIndexEmployee(lastName);
            if (index < 0) {
                System.out.println("Сотрудника с такой фамилие не существует. Попробуйте еще раз!");
            } else {
                System.out.print("\nВы точно желаете удалить сотрудника (Да-1, Нет-2): ");
                int var = Integer.parseInt(scan.nextLine());
                if (var == 1) {
                    this.employees.remove(index);
                    System.out.println("\nСотрудник удален!\n");
                    Thread.sleep(500);
                    saveListEmployees();
                } else {
                    System.out.println("\nВовзрат в начальое меню\n");
                    Thread.sleep(500);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void findEmployee() {
        System.out.println("Поиск сотрудника по фамилии:\n");
        try {
            System.out.print("\nВведите Фамилию сотрудника: ");
            String lastName = scan.nextLine();
            int index = findIndexEmployee(lastName);
            if (index < 0) {
                System.out.println("Сотрудника с такой фамилие не существует. Попробуйте еще раз!");
            } else {
                Employee emp = this.employees.get(index);
                System.out.println("\n\t\tДанные сотрудника: ");
                System.out.println("\tFirstName\tLastName\tJob\tDepartment\tAge");
                emp.print();
                Thread.sleep(1000);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public int findIndexEmployee(String lastName) {
        try {
            int index = 0;
            for (Employee e : this.employees) {
                if (e.getLastName() == lastName)
                    index = this.employees.indexOf(e);
            }
            return index;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return -1;
    }

    public void printEmployees() {
        System.out.println("\tВывод информации обо всех сотрудниках");
        System.out.println("\tFirstName\tLastName\tJob\tDepartment\tAge");
        try {
            for (Employee ems : this.employees) {
                ems.print();
            }
            System.out.print("\nЖелаете сохранить информацию в файл (Да-1, Нет-2): ");
            int d = Integer.parseInt(scan.nextLine());
            if (d == 1) {
                saveFindInformation(this.employees);
            } else {
                System.out.println("\nВовзрат в начальное меню\n");
                Thread.sleep(500);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void printAgeEmployees() {
        System.out.println("\tВывод информации обо всех сотрудниках определенного возраста");
        try {
            System.out.print("\nВведите с каким возрастом вывести сотрудников: ");
            int voz = Integer.parseInt(scan.nextLine());
            ArrayList<Employee> newEmp = new ArrayList<>();
            for (Employee emp : this.employees) {
                if (emp.getAge() == voz) {
                    newEmp.add(emp);
                }
            }
            if (newEmp.size() == 0) {
                System.out.println("В Корпорации нет сотрудников с таким возростом!");
            } else {
                System.out.println("\tFirstName\tLastName\tJob\tDepartment\tAge");
                for (Employee ems : newEmp) {
                    ems.print();
                }
                System.out.print("\nЖелаете сохранить информацию в файл (Да-1, Нет-2): ");
                int d = Integer.parseInt(scan.nextLine());
                if (d == 1) {
                    saveFindInformation(newEmp);
                } else {
                    System.out.println("\nВовзрат в начальное меню\n");
                    Thread.sleep(500);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void printNameEmployees() {
        System.out.println("\tВывод информации обо всех сотрудниках по букве в фамилии");
        try {
            System.out.print("\nВведите первую букву фамилии: ");
            String voz = scan.nextLine();
            ArrayList<Employee> newEmp = new ArrayList<>();
            for (Employee emp : this.employees) {
                if (Objects.equals(emp.getLastName().split("")[0], voz.toUpperCase())) {
                    newEmp.add(emp);
                }
            }
            if (newEmp.size() == 0) {
                System.out.println("В Корпорации нет сотрудников с такой фамилией!");
            } else {
                System.out.println("\tFirstName\tLastName\tJob\tDepartment\tAge");
                for (Employee ems : newEmp) {
                    ems.print();
                }
                System.out.print("\nЖелаете сохранить информацию в файл (Да-1, Нет-2): ");
                int d = Integer.parseInt(scan.nextLine());
                if (d == 1) {
                    saveFindInformation(newEmp);
                } else {
                    System.out.println("\nВовзрат в начальное меню\n");
                    Thread.sleep(500);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    public void saveListEmployees() {
        try {
            FileOutputStream fos = new FileOutputStream(this.path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.employees);
            System.out.println("Данные сохранены!");
            Thread.sleep(500);
            oos.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void loadListEmployees() {
        try {
            FileInputStream fis = new FileInputStream(this.path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            this.employees = (ArrayList<Employee>) ois.readObject();
            ois.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveFindInformation(ArrayList<Employee> ems) {
        FileWriter file = null;
        try {
            System.out.print("\nВведите название файла: ");
            String nameFile = scan.nextLine() + ".txt";
            String pathFile = "d:\\Users\\MIKOLKA\\JavaDZ\\DZ_1\\src\\DZ_11\\Exercise_5\\" + nameFile;
            file = new FileWriter(pathFile);
            String hand = "\tFirstName\tLastName\tJob\tDepartment\tAge";
            file.write(hand);
            file.write("\n");
            for (Employee emp : ems) {
                String dany = "\t" + emp.getFirstName() + "\t\t" + emp.getLastName() + "\t\t" + emp.getJob() + "\t" +
                        emp.getDepartment() + "\t\t" + emp.getAge();
                file.write(dany);
                file.write("\n");
            }
            System.out.printf("\nДаные сохранены в файл - %s. Путь к файлу: %s", nameFile, pathFile);
            Thread.sleep(2000);
            file.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
