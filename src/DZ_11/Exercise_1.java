package DZ_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) throws IOException {
        FileReader file_1 = null;
        FileReader file_2 = null;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("\nВведите путь к первому файлу: ");
            String path_1 = scan.nextLine();
            System.out.print("\nВведите путь к второму файлу: ");
            String path_2 = scan.nextLine();
            file_1 = new FileReader(path_1);
            file_2 = new FileReader(path_2);
            BufferedReader bf_1 = new BufferedReader(file_1);
            BufferedReader bf_2 = new BufferedReader(file_2);

            ArrayList<String> line_2 = new ArrayList<>();
            String st_2 = "";
            String line = "";
            while ((st_2 = bf_2.readLine()) != null) {
                line_2.add(st_2);
            }
            System.out.println("");
            while ((line = bf_1.readLine()) != null) {
                if(!line_2.contains(line)){
                    System.out.println(line);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            file_1.close();
            file_2.close();
        }
    }
}
