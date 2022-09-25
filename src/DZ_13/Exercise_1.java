package DZ_13;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.abs;

public class Exercise_1 {
    public static void main(String[] args) {
        try {
            int[] arr = new Random().ints(100, -9999, 9999).toArray();
            int countP = (int) Arrays.stream(arr).filter(x -> x > 0).count();
            System.out.println("Количество положительных: " + countP);
            int countOt = (int) Arrays.stream(arr).filter(x -> x < 0).count();
            System.out.println("Количество потрицательных: " + countOt);
            int countD = (int) Arrays.stream(arr).filter(x -> Integer.toString(abs(x)).length() == 3).count();
            System.out.println("Количество двухзначных: " + countD);
            int countZ = (int) Arrays.stream(arr).filter(x -> Integer.toString(abs(x)).
                    equals(new StringBuilder(Integer.toString(abs(x))).reverse().toString())).count();
            System.out.println("Количество зеркальных: " + countZ);

            System.out.println("\nFINISH");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
