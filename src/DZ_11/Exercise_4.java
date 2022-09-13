package DZ_11;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args) throws IOException {
        FileWriter file = null;
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("\nВведите путь к файлу: ");
            String path = scan.nextLine();
            file = new FileWriter(path);
            System.out.print("\nВведите целочисленные массива через пробел: ");
            String[] arrSt = scan.nextLine().split(" ");
            int[] arr = new int[arrSt.length];
            for (int i = 0; i < arrSt.length; i++) {
                arr[i] = Integer.parseInt(arrSt[i]);
            }
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    for (int a : arr) {
                        file.write(a + " ");
                    }
                    file.write("\n");
                }
                if (j == 1) {
                    for (int a : arr) {
                        if (a % 2 == 0)
                            file.write(a + " ");
                    }
                    file.write("\n");
                }
                if (j == 2) {
                    for (int a : arr) {
                        if (a % 2 != 0)
                            file.write(a + " ");
                    }
                    file.write("\n");
                }
                if (j == 3) {
                    for (int i=arr.length-1; i>=0; i--) {
                            file.write(arr[i] + " ");
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }finally {
            file.close();
        }

    }
}
