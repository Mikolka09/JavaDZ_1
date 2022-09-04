package DZ_8;

import lombok.Data;

import java.util.*;

@Data
public class Jetty implements Runnable {

    Queue<Ship> ships;
    Queue<People> peoples;
    double interval;
    int peopleAvg;
    int shipAvg;
    int peoplesOut;
    int shipOut;
    int startWork;
    int finishWork;
    Scanner scan = new Scanner(System.in);
    Random rnd = new Random();

    private void startWork() throws InterruptedException {
        System.out.print("Введите целочисленное время начало работы причала (от 0 до 24): ");
        this.startWork = Integer.parseInt(scan.nextLine());
        System.out.print("\nВведите целочисленное время конца работы причала (от 0 до 24): ");
        this.finishWork = Integer.parseInt(scan.nextLine());
        int timeWorkJetty = (this.finishWork - this.startWork) * 60;
        System.out.print("\nВведите среднее время пребывания человека на причал в минутах: ");
        this.peopleAvg = Integer.parseInt(scan.nextLine());
        System.out.print("\nВведите среднее время пребывания корабля на причал в минутах: ");
        this.shipAvg = Integer.parseInt(scan.nextLine());
        workJetty(timeWorkJetty);
    }

    private void workJetty(int timeWorkJetty) throws InterruptedException {
        System.out.printf("\nВремя: %s:00. Рабочий день начался!\n", this.startWork);
        this.peoples = new LinkedList<>();
        this.ships = new LinkedList<>();
        int timeWork = 1;
        int cntPeople = 1;
        int cntShip = 1;
        this.peoplesOut = 0;
        this.shipOut = 0;
        while (timeWork < timeWorkJetty) {

            if (timeWork % this.peopleAvg == 0) {
                People plp = new People(cntPeople++);
                System.out.println("Пришел человек на причал!");
                this.peoples.add(plp);
                System.out.printf("\nКоличество людей на причале: %s\n", peoples.size());
            }
            if (timeWork % this.shipAvg == 0) {
                Ship ship = new Ship(cntShip++);
                System.out.println("Пришел корабель на причал!");
                Thread.sleep(100);
                int type = rnd.nextInt(2);
                if (type == 0) {
                    System.out.println("Для этого корабля это конечная остановка, посадки не будет!");
                    this.shipOut++;
                } else {
                    this.ships.add(ship);
                        loadingPeople();
                    System.out.printf("\nКоличество людей на причале после посадки: %s\n", peoples.size());
                }
            }
            if (timeWork == timeWorkJetty - 1) {
                System.out.printf("\nВремя: %s:00. Рабочий день кончился!", this.finishWork);
                System.out.println("\n-------------------------------------------------------------------");
                System.out.printf("\n\nЗа рабочий день пришло кол-во людей: %s", cntPeople);
                System.out.printf("\n\nЗа рабочий день сели на корабль кол-во людей: %s", this.peoplesOut);
                System.out.printf("\n\nЗа рабочий день не сели на корабль кол-во людей: %s",(cntPeople - this.peoplesOut));
                System.out.printf("\n\nЗа рабочий день прошло кол-во кораблей: %s", cntShip);
                System.out.printf("\n\nЗа рабочий день прошло кол-во кораблей с конечной остановкой: %s", this.shipOut);
                this.interval = timeWorkJetty / (double) this.peoplesOut;
                String result = String.format("%.2f",this.interval);
                System.out.printf("\n\nСреднее время пребывание человека на причале: %s минут", result);
            }
            timeWork++;
        }
    }

    private void loadingPeople() throws InterruptedException {
        System.out.println("Началась посадка людей на корабль!");
        Ship ship = ships.peek();
        int vacancies = ship.vacancies;
        ships.remove();
        while (vacancies > 0) {
            if(peoples.size()!=0){
                peoples.remove();
                this.peoplesOut++;
            }else
                break;
            vacancies--;
        }
        Thread.sleep(200);
        System.out.println("Закончилась посадка людей на корабль!");
    }


    @Override
    public void run() {
        try {
            startWork();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
