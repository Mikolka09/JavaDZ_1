package DZ_3;

import java.util.Arrays;

public class MyArray implements IMath, ISort {

    int[] arr;

    public MyArray(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void sortAsc() {
        for (int i = this.arr.length - 1; i >= 0; i--) {
            for (int j = i; j < this.arr.length-1; j++) {
                if (this.arr[j] > this.arr[j + 1]) {
                    int temp = this.arr[j];
                    this.arr[j] = this.arr[j+1];
                    this.arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(this.arr));
    }

    @Override
    public void sortDesc() {
        for (int i = this.arr.length - 1; i >= 0; i--) {
            for (int j = i; j < this.arr.length-1; j++) {
                if (this.arr[j] < this.arr[j + 1]) {
                    int temp = this.arr[j];
                    this.arr[j] = this.arr[j+1];
                    this.arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(this.arr));
    }

    @Override
    public int Max() {
        int max = this.arr[0];
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] > max) max = this.arr[i];
        }
        return max;
    }

    @Override
    public int Min() {
        int min = this.arr[0];
        for (int i = 0; i < this.arr.length; i++) {
            if (this.arr[i] < min) min = this.arr[i];
        }
        return min;
    }

    @Override
    public float Avg() {
        float sum = 0;
        for (int i = 0; i < this.arr.length; i++) {
            sum += this.arr[i];
        }
        float avg = sum / this.arr.length;
        return avg;
    }
}
