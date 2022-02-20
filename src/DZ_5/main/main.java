package DZ_5.main;

import DZ_5.db.DbManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
    public static void main(String[] args) throws SQLException {

        DbManager db = new DbManager("localhost:3306",
                "root", "", "cafe");

        Connection conn = (Connection) db.connect();

        Statement stat = conn.createStatement();

        //Задание 1
        /*stat.execute("insert into InfoOrderCafe(id_rangeDrink, id_client, dateOrder, summa)" +
                "values (2, 1, '15/02/2020', 542.25)");

        stat.execute("insert into InfoOrderCafe(id_rangeDesert, id_client, dateOrder, summa)" +
                "values (1, 1, '18/02/2020', 320.55)");

        stat.execute("insert into StaffTimetableCafe(id_staff, typeWork, monthWork, yearWork, countDayTime, countNightTime)" +
                "values (1, '2-2', 'March', 2022, 5, 6)");

        stat.execute("insert into RangeDrinkCafe(typeDrinkEn, typeDrinkRu, priceDrink) " +
                "values ('Coffe Brazil', 'Кофе Бразилия', 50.00)");*/

        //Задание 2
        /*stat.execute("update StaffTimetableCafe set typeWork='3-3', countDayTime=4, countNightTime=5 " +
                "where monthWork = 'March' and yearWork=2022");

        stat.execute("update RangeDrinkCafe set typeDrinkEn='Coffe Arabic', typeDrinkRu='Кофе Арабика' " +
                "where typeDrinkEn = 'Coffe Brazil'");

        stat.execute("update InfoOrderCafe set id_rangeDrink=2, summa=185.56 where id = 1");

        stat.execute("update RangeDesertCafe set typeDesertEn='Ice-Cream', typeDesertRu='Мороженное', priceDesert=25.45 " +
                "where id = 1");*/

        //Задание 3
        /*stat.execute("delete from InfoOrderCafe where id = 1");

        stat.execute("delete from InfoOrderCafe where id_rangerDesert = 1");

        stat.execute("delete from StaffTimetableCafe where monthWork = 'March' and yearWork=2022");

        stat.execute("delete from StaffTimetableCafe where typeWork = '2-2' and yearWork=2022");*/

        //Задание 4
        System.out.println("Вывод заказа определенного десерта");
        String sql1 = "select * from InfoOrderCafe where id_rangeDesert = 1";
        ResultSet set1 = db.getSelectQuery(sql1, conn);
        while (set1.next()) {
            System.out.println(set1.getInt("id") + " "
                    + set1.getInt("id_rangeDesert") + " "
                    + set1.getInt("id_rangeDrink") + " "
                    + set1.getInt("id_client") + " "
                    + set1.getString("dateOrder") + " "
                    + set1.getDouble("summa"));
        }

        System.out.println("");
        System.out.println("Вывод расписания определенного месяца");
        String sql2 = "select * from StaffTimetableCafe where monthWork = 'March'";
        ResultSet set2 = db.getSelectQuery(sql2, conn);
        while (set2.next()) {
            System.out.println(set2.getInt("id") + " "
                    + set2.getInt("id_staff") + " "
                    + set2.getString("typeWork") + " "
                    + set2.getString("monthWork") + " "
                    + set2.getInt("yearWork")+ " "
                    + set2.getInt("countDayTime") + " "
                    + set2.getInt("countNightTime"));
        }

        System.out.println("");
        System.out.println("Вывод данных определенного официанта");
        String sql3 = "select * from StaffCafe where posit = 'Официант' and id = 3";
        ResultSet set3 = db.getSelectQuery(sql3, conn);
        while (set3.next()) {
            System.out.println(set3.getInt("id") + " "
                    + set3.getString("FIO") + " "
                    + set3.getString("telefon") + " "
                    + set3.getString("email") + " "
                    + set3.getString("posit"));
        }

        System.out.println("");
        System.out.println("Вывод данных определенного клиента");
        String sql4 = "select * from ClientCafe where id = 1";
        ResultSet set4 = db.getSelectQuery(sql4, conn);
        while (set4.next()) {
            System.out.println(set4.getInt("id") + " "
                    + set4.getString("FIO") + " "
                    + set4.getString("birthday") + " "
                    + set4.getString("telefon") + " "
                    + set4.getString("adress") + " "
                    + set4.getInt("discont"));
        }

    }
}