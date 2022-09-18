package DZ_12.Exercise_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class MyThreadFactorial extends Thread {
    String pathRead;
    String pathWrite = "d:\\Users\\MIKOLKA\\JavaDZ\\DZ_1\\src\\DZ_12\\Exercise_2\\file_factorial.txt";
    FileWriter writer = null;
    FileReader reader = null;
    ArrayList<Integer> result;

    public MyThreadFactorial(String name) {
        super(name);
    }

    public int resFactorial(int n) {
        int result = 1;
        for (int i = 1; i < n; i++) {
            result *= i;
        }
        return result;
    }

    public void run() {
        System.out.println("Запустился поток: " + Thread.currentThread().getName());
        try{
            this.result = new ArrayList<>();
            this.reader = new FileReader(this.pathRead);
            this.writer = new FileWriter(this.pathWrite);
            BufferedReader buff = new BufferedReader(reader);
            String line = "";
            StringBuilder line_numb = new StringBuilder();
            while ((line = buff.readLine()) != null) {
                line_numb.append(line);
            }
            this.reader.close();
            String[] arr_numb = line_numb.toString().split(" ");
            int[] arr = new int[arr_numb.length];
            for (int i = 0; i < arr_numb.length; i++) {
                arr[i] = Integer.parseInt(arr_numb[i]);
            }
            int res = 0;
            for (int a:arr){
                res = resFactorial(a);
                result.add(res);
                writer.write(res+ " ");
            }
            this.writer.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
