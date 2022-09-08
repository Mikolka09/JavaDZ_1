package DZ_10;

//Сложение дробей
interface Operation_5 {
    String sumDrob(String a, String b);
}

//Сложение дробей
interface Operation_6 {
    String subDrob(String a, String b);
}

//Умножение дробей
interface Operation_7 {
    String multDrob(String a, String b);
}

//Деление дробей
interface Operation_8 {
    String devDrob(String a, String b);
}


public class Exercise_2 {
    public static void main(String[] args) {
        //Сложение дробей
        Operation_5 op_5 = (a, b) -> {
            String[] drob_1 = a.split("/");
            String[] drob_2 = b.split("/");
            int ch_1 = Integer.parseInt(drob_1[0]);
            int ch_2 = Integer.parseInt(drob_2[0]);
            int zn_1 = Integer.parseInt(drob_1[1]);
            int zn_2 = Integer.parseInt(drob_2[1]);
            int ch = zn_2 * ch_1 + zn_1 * ch_2;
            int zn = zn_1 * zn_2;
            String res = ch + "/" + zn;
            return res;
        };
        String res_5 = op_5.sumDrob("2/3", "1/2");
        System.out.println("Сумма дробей равняется: " + res_5);

        //Вычетание дробей
        Operation_6 op_6 = (a, b) -> {
            String[] drob_1 = a.split("/");
            String[] drob_2 = b.split("/");
            int ch_1 = Integer.parseInt(drob_1[0]);
            int ch_2 = Integer.parseInt(drob_2[0]);
            int zn_1 = Integer.parseInt(drob_1[1]);
            int zn_2 = Integer.parseInt(drob_2[1]);
            int ch = zn_2 * ch_1 - zn_1 * ch_2;
            int zn = zn_1 * zn_2;
            String res = ch + "/" + zn;
            return res;
        };
        String res_6 = op_6.subDrob("5/3", "3/2");
        System.out.println("Вычетание дробей равняется: " + res_6);

        //Умножение дробей
        Operation_7 op_7 = (a, b) -> {
            String[] drob_1 = a.split("/");
            String[] drob_2 = b.split("/");
            int ch_1 = Integer.parseInt(drob_1[0]);
            int ch_2 = Integer.parseInt(drob_2[0]);
            int zn_1 = Integer.parseInt(drob_1[1]);
            int zn_2 = Integer.parseInt(drob_2[1]);
            int ch = ch_1 * ch_2;
            int zn = zn_1 * zn_2;
            String res = ch + "/" + zn;
            return res;
        };
        String res_7 = op_7.multDrob("2/3", "1/2");
        System.out.println("Вычетание дробей равняется: " + res_7);

        //Деление дробей
        Operation_8 op_8 = (a, b) -> {
            String[] drob_1 = a.split("/");
            String[] drob_2 = b.split("/");
            int ch_1 = Integer.parseInt(drob_1[0]);
            int ch_2 = Integer.parseInt(drob_2[0]);
            int zn_1 = Integer.parseInt(drob_1[1]);
            int zn_2 = Integer.parseInt(drob_2[1]);
            int ch = ch_1 * zn_2;
            int zn = zn_1 * ch_2;
            String res = ch + "/" + zn;
            return res;
        };
        String res_8 = op_8.devDrob("2/3", "1/2");
        System.out.println("Деление дробей равняется: " + res_8);
    }
}
