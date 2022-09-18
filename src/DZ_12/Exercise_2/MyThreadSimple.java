package DZ_12.Exercise_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class MyThreadSimple extends Thread {
    String pathRead;
    String pathWrite = "d:\\Users\\MIKOLKA\\JavaDZ\\DZ_1\\src\\DZ_12\\Exercise_2\\file_simple.txt";
    FileWriter writer = null;
    FileReader reader = null;
    ArrayList<Integer> result;

    public MyThreadSimple(String name) {
        super(name);
    }

    public boolean NumberIs(int a) {
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    public void run() {
        System.out.println("Запустился поток: " + Thread.currentThread().getName());
        try {
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
            boolean flag;
            for (int a : arr) {
                flag = NumberIs(a);
                if (flag) {
                    result.add(a);
                    writer.write(a + " ");
                }
            }
            this.writer.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
