package DZ_3;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,5,6,8,10,5};
        MyArray myArray = new MyArray(arr);
        System.out.println("Max: " + myArray.Max());
        System.out.println("Min: " + myArray.Min());
        System.out.println("Avg: " + myArray.Avg());
        myArray.sortAsc();
        myArray.sortDesc();
    }
}
