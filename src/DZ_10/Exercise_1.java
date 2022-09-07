package DZ_10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//Высокосный ли год
interface Operation_1 {
    void leapYear(int year);
}

//Количество дней между двумя датами
interface Operation_2 {
    int amountOfDays(String firstDate, String secondDate);
}

//Количество полных недель между двумя датами
interface Operation_3 {
    double amountOfWeek(String firstDate, String secondDate);
}

//Подсчет дня недели по дате
interface Operation_4 {
    void dayOfWeek(String date);
}


public class Exercise_1 {
    public static void main(String[] args) {
        //Высокосный ли год
        Operation_1 op_1 = (year) -> {
            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    System.out.printf("\nГод %s высокосный!", year);
                }
            } else {
                System.out.printf("\nГод %s не высокосный!", year);
            }
        };
        op_1.leapYear(2004);

        //Количество дней между двумя датами
        Operation_2 op_2 = (f, s) -> {
            SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
            Date first = null;
            Date second = null;
            try {
                first = df.parse(f);
                second = df.parse(s);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            int day = (int) Math.abs((second.getTime() - first.getTime()) / 86400000);
            return day;
        };
        int res = op_2.amountOfDays("10.10.2021", "20.10.2020");
        System.out.printf("\nКоличество дней - %s", res);

        //Количество полных недель между двумя датами
        Operation_3 op_3 = (f, s) -> {
            int days = op_2.amountOfDays(f, s);
            return Math.floor((double) days / 7);
        };
        double week = op_3.amountOfWeek("10.10.2022", "25.10.2022");
        System.out.printf("\nКоличество полных недель - %s", week);

        //Подсчет дня недели по дате
        Operation_4 op_4 = (date) -> {
            SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
            Date firstDay = null;
            try {
                firstDay = df.parse(date);
                DateFormat format = new SimpleDateFormat("EEEE");
                String finalDay = format.format(firstDay).toUpperCase(Locale.ROOT);
                System.out.printf("\nДата %s это " + finalDay, date);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        };

        op_4.dayOfWeek("05.09.2022");

        System.out.println("\n\nEND");
    }

}
