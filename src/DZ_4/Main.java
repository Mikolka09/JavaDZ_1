package DZ_4;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrI = new int[20];
        MyArray<int[]> arr = new MyArray<int[]>(arrI);
        arrI = arr.fillIntRandom(arrI);
        System.out.println(Arrays.toString(arrI));
        arrI = arr.sortIntDesc(arrI);
        System.out.println(Arrays.toString(arrI));
        System.out.println("Max: " + arr.maxIntArray(arrI));
        System.out.println("Min: " + arr.minIntArray(arrI));
        System.out.println("Avg: " + arr.avgIntArray(arrI));

    }
}
