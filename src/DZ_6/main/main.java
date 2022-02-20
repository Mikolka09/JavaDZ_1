package DZ_6.main;

import DZ_6.db.DbManager;

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
        /*System.out.println("");
        System.out.println("Показать минимальную скидку клиента");
        String sql1 = "select min(discont) as min from ClientCafe";
        ResultSet set1 = db.getSelectQuery(sql1, conn);
        while (set1.next()) {
            System.out.println(set1.getInt("min"));
        }

        System.out.println("");
        System.out.println("Показать максимальную скидку клиента");
        String sql2 = "select max(discont) as max from ClientCafe";
        ResultSet set2 = db.getSelectQuery(sql2, conn);
        while (set2.next()) {
            System.out.println(set2.getInt("max"));
        }

        System.out.println("");
        System.out.println("Показать клиента с минимальной скидкой");
        String sql3 = "select id, FIO, discont from ClientCafe where discont=(select min(discont) as min from ClientCafe)";
        ResultSet set3 = db.getSelectQuery(sql3, conn);
        while (set3.next()) {
            System.out.println(set3.getInt("id") + " "
                    + set3.getString("FIO") + " "
                    + set3.getString("discont"));
        }

        System.out.println("");
        System.out.println("Показать клиента с максимальной скидкой");
        String sql4 = "select id, FIO, discont from ClientCafe where discont=(select max(discont) as max from ClientCafe)";
        ResultSet set4 = db.getSelectQuery(sql4, conn);
        while (set4.next()) {
            System.out.println(set4.getInt("id") + " "
                    + set4.getString("FIO") + " "
                    + set4.getString("discont"));
        }

        System.out.println("");
        System.out.println("Показать среднюю величину скидки");
        String sql5 = "select avg(discont) as avg from ClientCafe";
        ResultSet set5 = db.getSelectQuery(sql5, conn);
        while (set5.next()) {
            System.out.println(set5.getInt("avg"));
        }*/


        //Задание 2
        /*System.out.println("");
        System.out.println("Показать самого молодога клиента");
        String sql1 = "select id, FIO, birthday from ClientCafe where birthday=(select min(birthday) as min from ClientCafe)";
        ResultSet set1 = db.getSelectQuery(sql1, conn);
        while (set1.next()) {
            System.out.println(set1.getInt("id") + " "
                    + set1.getString("FIO") + " "
                    + set1.getString("birthday"));
        }

        System.out.println("");
        System.out.println("Показать самого возрастного клиента");
        String sql2 = "select id, FIO, birthday from ClientCafe where birthday=(select max(birthday) as max from ClientCafe)";
        ResultSet set2 = db.getSelectQuery(sql2, conn);
        while (set2.next()) {
            System.out.println(set2.getInt("id") + " "
                    + set2.getString("FIO") + " "
                    + set2.getString("birthday"));
        }

        System.out.println("");
        System.out.println("Показать клиента у которого сегодня день рождение");
        String sql3 = "select id, FIO, birthday from ClientCafe where moth(birthday)=month(now()) and " +
                "day(birthday)=day(now())";
        ResultSet set3 = db.getSelectQuery(sql3, conn);
        while (set3.next()) {
            System.out.println(set3.getInt("id") + " "
                    + set3.getString("FIO") + " "
                    + set3.getString("birthday"));
        }

        System.out.println("");
        System.out.println("Показать клиента у которого не заполнен адрес");
        String sql4 = "select id, FIO, birthday from ClientCafe where adress is null";
        ResultSet set4 = db.getSelectQuery(sql4, conn);
        while (set4.next()) {
            System.out.println(set4.getInt("id") + " "
                    + set4.getString("FIO") + " "
                    + set4.getString("birthday"));
        }*/

        //Задание 3
        /*System.out.println("Показать заказ в конкретную дату");
        String sql1 = "select * from InfoOrderCafe where dateOrder = '18/02/2020'";
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
        System.out.println("Показать заказы в указаном промежутке дат");
        String sql2 = "select * from InfoOrderCafe where dateOrder >= '12/02/2020' and dateOrder <= '25/02/2020'";
        ResultSet set2 = db.getSelectQuery(sql2, conn);
        while (set2.next()) {
            System.out.println(set2.getInt("id") + " "
                    + set2.getInt("id_rangeDesert") + " "
                    + set2.getInt("id_rangeDrink") + " "
                    + set2.getInt("id_client") + " "
                    + set2.getString("dateOrder") + " "
                    + set2.getDouble("summa"));
        }

        System.out.println("");
        System.out.println("Показать кол-во заказов десертов в определенную дату");
        String sql3 = "select count(*) as count from InfoOrderCafe where dateOrder = '18/02/2020' " +
                "and id_rangeDesert is not null";
        ResultSet set3 = db.getSelectQuery(sql3, conn);
        while (set3.next()) {
            System.out.println(set3.getInt("count"));
        }

        System.out.println("");
        System.out.println("Показать кол-во заказов наптков в определенную дату");
        String sql4 = "select count(*) as count from InfoOrderCafe where dateOrder = '15/02/2020' " +
                "and id_rangeDrink is not null";
        ResultSet set4 = db.getSelectQuery(sql4, conn);
        while (set4.next()) {
            System.out.println(set4.getInt("count"));
        }*/


        //Задание 4
       /* System.out.println("Игформация о клиентах заказывающие напитки сегодня");
        String sql1 = "select CC.id as id, CC.FIO as FIO, IO.id_rangeDrink as id_rangeDrink, " +
                "SC.FIO as FIO_SC, SC.posit as posit  from InfoOrderCafe as IO" +
                "left join StaffCafe as SC on IO.id_staffCafe = SC.id" +
                "left join ClientCafe as CC on IO.id_client = CC.id" +
                "where dateOrder = now()";
        ResultSet set1 = db.getSelectQuery(sql1, conn);
        while (set1.next()) {
            System.out.println(set1.getInt("id") + " "
                    + set1.getString("FIO") + " "
                    + set1.getInt("id_rangeDrink") + " "
                    + set1.getString("FIO_SC") + " "
                    + set1.getString("posit"));
        }

        System.out.println("");
        System.out.println("Средняя сумма заказа в определенную дату");
        String sql2 = "select avg(summa) as avg from InfoOrderCafe where dateOrder='18/02/2020'";
        ResultSet set2 = db.getSelectQuery(sql2, conn);
        while (set2.next()) {
            System.out.println(set2.getDouble("avg"));
        }

        System.out.println("");
        System.out.println("Максимальная сумма заказа в определенную дату");
        String sql3 = "select max(summa) as max from InfoOrderCafe where dateOrder='18/02/2020'";
        ResultSet set3 = db.getSelectQuery(sql3, conn);
        while (set3.next()) {
            System.out.println(set3.getDouble("max"));
        }

        System.out.println("");
        System.out.println("Клиент совершивший заказ на максимальную сумму в определенную дату");
        String sql4 = "select CC.id as id, CC.FIO as FIO, IO.summa as summa from InfoOrderCafe as IO" +
                "left join ClientCafe as CC on IO.id_client = CC.id" +
                "where summa = (select max(summa) as max from InfoOrderCafe where dateOrder='18/02/2020')";
        ResultSet set4 = db.getSelectQuery(sql4, conn);
        while (set4.next()) {
            System.out.println(set4.getInt("id") + " "
                    + set4.getString("FIO") + " "
                    + set4.getDouble("summa"));
        }*/

        //Задание 5
        System.out.println("");
        System.out.println("Расписание определенного баристов на определенный месяц");
        String sql1 = "select * from StaffTimetableCafe as ST" +
                "left join StaffCafe as SC on ST.id_staff = SC.id " +
                "where posit = 'Бариста' and monthWork='March' and FIO='Иванов Иван'";
        ResultSet set1 = db.getSelectQuery(sql1, conn);
        while (set1.next()) {
            System.out.println(set1.getInt("id") + " "
                    + set1.getString("FIO") + " "
                    + set1.getString("telefon") + " "
                    + set1.getString("email") + " "
                    + set1.getString("posit"));
        }

        System.out.println("");
        System.out.println("Расписание всех баристов на определенный месяц");
        String sql2 = "select * from StaffTimetableCafe as ST" +
                "left join StaffCafe as SC on ST.id_staff = SC.id " +
                "where posit = 'Бариста' and monthWork='March'";
        ResultSet set2 = db.getSelectQuery(sql2, conn);
        while (set2.next()) {
            System.out.println(set2.getInt("id") + " "
                    + set2.getString("FIO") + " "
                    + set2.getString("telefon") + " "
                    + set2.getString("email") + " "
                    + set2.getString("posit"));
        }

        System.out.println("");
        System.out.println("Расписание всех работников на определенный месяц");
        String sql3 = "select * from StaffTimetableCafe as ST" +
                "left join StaffCafe as SC on ST.id_staff = SC.id " +
                "where monthWork='March'";
        ResultSet set3 = db.getSelectQuery(sql3, conn);
        while (set3.next()) {
            System.out.println(set3.getInt("id") + " "
                    + set3.getString("FIO") + " "
                    + set3.getString("telefon") + " "
                    + set3.getString("email") + " "
                    + set3.getString("posit"));
        }




    }
}