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








       /* stat.execute("create table if not exists RangeDrinkCafe("
                + "id integer primary key auto_increment, "
                + "typeDrinkEn varchar(100), typeDrinkRu varchar(100), " +
                "priceDrink double)");

        stat.execute("create table if not exists RangeDesertCafe("
                + "id integer primary key auto_increment, "+
                "typeDesertEn varchar(100), typeDesertRu varchar(100)," +
                "priceDesert double)");

        stat.execute("create table if not exists StaffCafe("
                + "id integer primary key auto_increment, "
                + "FIO varchar(100), telefon varchar(100), email varchar(100), " +
                "posit varchar(100))");

        stat.execute("create table if not exists ClientCafe("
                + "id integer primary key auto_increment, "
                + "FIO varchar(100), birthday varchar(15), telefon integer, adress varchar(100), " +
                "discont integer)");

        stat.execute("create table if not exists StaffTimetableCafe("
                + "id integer primary key auto_increment, "
                + "id_staff integer, typeWork varchar(100), monthWork varchar(100), yearWork integer, " +
                "countDayTime integer, countNightTime integer)");

        stat.execute("create table if not exists InfoOrderCafe("
                + "id integer primary key auto_increment, "
                + "id_rangeDesert integer, id_rangeDrink integer, id_client integer," +
                "dateOrder varchar(15), summa double)");*/

        //Задание 2
        /*stat.execute("insert into RangeDrinkCafe(typeDrinkEn, typeDrinkRu, priceDrink) " +
                "values ('Coffe', 'Кофе', 40.00)");

        stat.execute("insert into RangeDesertCafe(typeDesertEn, typeDesertRu, priceDesert) " +
                "values ('Cupcake', 'Пироженое', 50.50)");

        stat.execute("insert into StaffCafe(FIO, telefon, email, posit)" +
                "values ('Иванов Иван', '0953258525', 'ivanov@gmail.com', 'Бариста')");

        stat.execute("insert into StaffCafe(FIO, telefon, email, posit)" +
                "values ('Пушкина Анна', '0678562536', 'pushkaanna@gmail.com', 'Кондитер')");

        stat.execute("insert into ClientCafe(FIO, birthday, telefon, adress, discont)" +
                "values ('Ларик Дмитрий', '20/10/1985', '0661548597', 'Пушкинаб 25', 10)");*/

        //Задание 3
        /*stat.execute("update RangeDrinkCafe set priceDrink=25.25 where typeDrinkEn = 'Coffe'");

        stat.execute("update StaffCafe set email='annka@ukr.net' where posit = 'Кондитер'");

        stat.execute("update StaffCafe set telefon='0972561235' where FIO = 'Иванов Иван'");

        stat.execute("update ClientCafe set discont=15 where FIO = 'Ларик Дмитрий'");*/

        //Задание 4
        /*stat.execute("delete from RangeDrinkCafe where typeDesertEn = 'Cupcake'");

        stat.execute("delete from StaffCafe where FIO = 'Дротов Василий' and posit = 'Официант'");

        stat.execute("delete from StaffCafe where FIO = 'Иванов Иван' and posit = 'Бариста'");

        stat.execute("delete from ClientCafe where FIO = 'Ларик Дмитрий'");*/

        //Задание 5
        /*String sql1 = "select * from RangeDrinkCafe";
        ResultSet set1 = db.getSelectQuery(sql1, conn);
        while (set1.next()) {
            System.out.println(set1.getInt("id") + " "
                    + set1.getString("typeDrinkEn") + " "
                    + set1.getString("typeDrinkRu") + " "
                    + set1.getDouble("priceDrink"));
        }

        String sql2 = "select * from RangeDesertCafe";
        ResultSet set2 = db.getSelectQuery(sql2, conn);
        while (set2.next()) {
            System.out.println(set2.getInt("id") + " "
                    + set2.getString("typeDesertEn") + " "
                    + set2.getString("typeDesertRu") + " "
                    + set2.getDouble("priceDesert"));
        }

        String sql3 = "select * from StaffCafe where posit = 'Бариста'";
        ResultSet set3 = db.getSelectQuery(sql3, conn);
        while (set3.next()) {
            System.out.println(set3.getInt("id") + " "
                    + set3.getString("FIO") + " "
                    + set3.getString("telefon") + " "
                    + set3.getString("email") + " "
                    + set3.getString("posit"));
        }

        String sql4 = "select * from StaffCafe where posit = 'Официант'";
        ResultSet set4 = db.getSelectQuery(sql4, conn);
        while (set4.next()) {
            System.out.println(set4.getInt("id") + " "
                    + set4.getString("FIO") + " "
                    + set4.getString("telefon") + " "
                    + set4.getString("email") + " "
                    + set4.getString("posit"));
        }
*/

       /* DbManager db = new DbManager("localhost:3306",
                "root", "", "test");

        Connection conn = (Connection) db.connect();

        Statement stat = conn.createStatement();

        stat.execute("create table if not exists Student("
                + "id integer primary key auto_increment, "
                + "name varchar(100), rate double);");

        String s1_name = "Corwin of Amber";
        double s1_rate = 190;
        String ins1 = "insert into Student(name, rate) values ("
                + "'" + s1_name + "', " + s1_rate + ")";
        stat.execute(ins1);


        String s2_name = "Han Solo";
        double s2_rate = 185;
        PreparedStatement stat2 = conn.prepareStatement(
                "insert into Student(name, rate) values (?,?)");
        stat2.setString(1, s2_name);
        stat2.setDouble(2, s2_rate);
        stat2.executeUpdate();

        String sql = "select * from Student";
        ResultSet set = db.getSelectQuery(sql, conn);
        while (set.next()) {
            System.out.println(set.getInt("id") + " "
                    + set.getString("name") + " "
                    + set.getDouble("rate"));
        }*/
    }
}