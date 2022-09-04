package DZ_8;

import java.util.Random;

public class Ship {
    String nameShip;
    int vacancies;
    Random rnd = new Random();

    public Ship(int cnt){
        nameShip = "Ship №"+cnt;
        vacancies = rnd.nextInt(15);
    }

}
