package DZ_11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise_3 {
    public static void main(String[] args) throws IOException {
        FileReader file = null;
        String path = "d:\\Users\\MIKOLKA\\JavaDZ\\DZ_1\\src\\DZ_11\\file.txt";
        try {
            file = new FileReader(path);
            BufferedReader bf = new BufferedReader(file);
            ArrayList<int[]> arrays = new ArrayList<>();
            String line = "";
            while ((line = bf.readLine()) != null) {
                String[] str = line.split(" ");
                int[] arr = new int[str.length];
                for (int i = 0; i < str.length; i++) {
                    arr[i] = Integer.parseInt(str[i]);
                }
                arrays.add(arr);
            }
            System.out.println("\nВывод массивов:\n");
            int i = 1;
            for (int[] arr : arrays) {
                System.out.println("Массив №" + i + ": " + Arrays.toString(arr) + ", " +
                        "max: " + Arrays.stream(arr).max().getAsInt() + ", min: " + Arrays.stream(arr).min().getAsInt()
                        + ", summa: " + Arrays.stream(arr).sum());
                i++;
            }
            System.out.println("\nОбщие данные по массивам:\n");
            int max = Arrays.stream(arrays.get(0)).max().getAsInt();
            int min = Arrays.stream(arrays.get(0)).min().getAsInt();
            int sum = 0;
            for (int[] arr : arrays) {
                if (max < Arrays.stream(arr).max().getAsInt()) {
                    max = Arrays.stream(arr).max().getAsInt();
                }
                if (min > Arrays.stream(arr).min().getAsInt()) {
                    min = Arrays.stream(arr).min().getAsInt();
                }
                sum += Arrays.stream(arr).sum();
            }
            System.out.println("Общий максимум: " + max + ", Общий минимум: " + min + ", Общая сумма: " + sum);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            file.close();
        }
    }
}
