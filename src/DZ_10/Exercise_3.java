package DZ_10;

//Максимум из четырех
interface Operation_9<T> {
    void maxOfFour(T a, T b, T c, T d);
}

//Минимальное из четырех
interface Operation_10<T> {
    void minOfFour(T a, T b, T c, T d);
}

public class Exercise_3 {
    public static void main(String[] args) {
        //Максимум из четырех
        Operation_9<Integer> op_9 = (a, b, c, d) -> {
            int max = a > b ? a : b;
            max = max > c ? max : c;
            max = max > d ? max : d;
            System.out.println("Максимальное число из четырех будет равно: " + max);
        };
        op_9.maxOfFour(10, 23,15, 6);

        Operation_9<Double> op_10 = (a, b, c, d) -> {
            double max = a > b ? a : b;
            max = max > c ? max : c;
            max = max > d ? max : d;
            System.out.println("Максимальное число из четырех будет равно: " + max);
        };
        op_10.maxOfFour(10.6, 12.8,12.9, 12.1);

        //Минимальное из четырех
        Operation_10<Integer> op_11 = (a, b, c, d) -> {
            int min = a < b ? a : b;
            min = min < c ? min : c;
            min = min < d ? min : d;
            System.out.println("Минимальное число из четырех будет равно: " + min);
        };
        op_11.minOfFour(10, 23,15, 6);

        Operation_10<Double> op_12 = (a, b, c, d) -> {
            double min = a < b ? a : b;
            min = min < c ? min : c;
            min = min < d ? min : d;
            System.out.println("Минимальное число из четырех будет равно: " + min);
        };
        op_12.minOfFour(10.6, 12.8,12.9, 12.1);
    }
}
