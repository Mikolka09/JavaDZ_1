package DZ_7;

import java.util.Random;
import java.util.Scanner;

public class MyMatrix {
    int row;
    int col;
    int[][] matrix;
    Scanner scanner = new Scanner(System.in);

    public MyMatrix(int row, int col) {
        this.col = col;
        this.row = row;
        this.matrix = new int[this.row][this.col];
    }

    public MyMatrix(int[][] newMatrix) {
        this.row = newMatrix.length;
        this.col = newMatrix[0].length;
        this.matrix = newMatrix;
    }

    public int[][] getMatrix() {
        return this.matrix;
    }

    public void fillMatrix() {
        int size = this.row * this.col;
        System.out.print("Ввведите " + size + " значений для добавление в матрицу через пробел: ");
        String[] get = scanner.nextLine().split(" ");
        int length = get.length;
        if (length == size) {
            int count = 0;
            for (int i = 0; i < this.row; i++) {
                for (int j = 0; j < this.col; j++) {
                    this.matrix[i][j] = Integer.parseInt(get[count]);
                    count++;
                }
            }
            System.out.println("Матрица заполнена!");
        } else {
            System.out.println("Количество введенных чисел больше размера матрицы!");
        }
    }

    public void fillMatrixRandom(int max) {
        Random rand = new Random();
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                this.matrix[i][j] = rand.nextInt(max);
            }
        }
        System.out.println("Матрица заполнена!");
    }

    public static MyMatrix addMatrix(MyMatrix first, MyMatrix second) {
        if (first.getMatrix().length != second.getMatrix().length ||
                first.getMatrix()[0].length != second.getMatrix()[0].length) {
            System.out.println("Марицы сложить не возможно!");
        } else {
            MyMatrix newMatrix = new MyMatrix(first.getMatrix().length, second.getMatrix()[0].length);
            for (int i = 0; i < newMatrix.row; i++) {
                for (int j = 0; j < newMatrix.col; j++) {
                    newMatrix.getMatrix()[i][j] = first.getMatrix()[i][j] + second.getMatrix()[i][j];
                }
            }
            System.out.println("Матрицы сложены!");
            return newMatrix;
        }
        return new MyMatrix(0, 0);
    }

    public static MyMatrix subtractMatrix(MyMatrix first, MyMatrix second) {
        if (first.getMatrix().length != second.getMatrix().length ||
                first.getMatrix()[0].length != second.getMatrix()[0].length) {
            System.out.println("Марицы вычесть не возможно!");
        } else {
            MyMatrix newMatrix = new MyMatrix(first.getMatrix().length, second.getMatrix()[0].length);
            for (int i = 0; i < newMatrix.row; i++) {
                for (int j = 0; j < newMatrix.col; j++) {
                    newMatrix.getMatrix()[i][j] = first.getMatrix()[i][j] - second.getMatrix()[i][j];
                }
            }
            System.out.println("Матрицы вычтены!");
            return newMatrix;
        }
        return new MyMatrix(0, 0);
    }

    public static MyMatrix multiplyMatrix(MyMatrix first, MyMatrix second) {
        if (first.getMatrix().length != second.getMatrix()[0].length) {
            System.out.println("Марицы перемножить не возможно!");
        } else {
            MyMatrix newMatrix;
            int row = first.getMatrix()[0].length;
            int col = second.getMatrix().length;
            int obj = second.getMatrix()[0].length;
            int[][] temp = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    for (int k = 0; k < obj; k++) {
                        temp[i][j] += first.getMatrix()[i][k] * second.getMatrix()[k][j];
                    }
                }
            }
            System.out.println("Матрицы перемножены!");
            newMatrix = new MyMatrix(temp);
            return newMatrix;
        }
        return new MyMatrix(0, 0);
    }

    public void max() {
        int max = this.matrix[0][0];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (max < this.matrix[i][j]) {
                    max = this.matrix[i][j];
                }
            }
        }
        System.out.println();
        System.out.printf("Максимальное занчение в матрице: %s", max);
    }

    public void min() {
        int min = this.matrix[0][0];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                if (min > this.matrix[i][j]) {
                    min = this.matrix[i][j];
                }
            }
        }
        System.out.println();
        System.out.printf("Минимальное занчение в матрице: %s", min);
    }

    public void avg() {
        double sum = 0;
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                sum += this.matrix[i][j];
            }
        }
        System.out.println();
        System.out.printf("Среднее аримфетическое значение в матрице: %s", sum / (this.row * this.col));
    }

    public void print() {
        if (this.matrix.length == 0) {
            System.out.println("Матрица пустая!");
        } else {
            System.out.println("Вывод матрицы:");
            for (int i = 0; i < this.row; i++) {
                for (int j = 0; j < this.col; j++) {
                    System.out.print(this.matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
