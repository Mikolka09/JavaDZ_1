package DZ_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) throws IOException {
        FileReader file = null;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("\nВведите путь к файлу: ");
            String path = scan.nextLine();
            file = new FileReader(path);
            BufferedReader bf = new BufferedReader(file);


            ArrayList<String> arrSt = new ArrayList<>();
            String st_2 = "";
            String line = "";
            while ((st_2 = bf.readLine()) != null) {
                arrSt.add(st_2);
            }
            int max = arrSt.get(0).length();
            for (String st : arrSt) {
                if (max < st.length()) {
                    max = st.length();
                    line = st;
                }
            }
            System.out.printf("\nМаксимальная строка: %s\nРазмер максимальной строки: %s символа", line, max);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            file.close();

        }
    }
}
