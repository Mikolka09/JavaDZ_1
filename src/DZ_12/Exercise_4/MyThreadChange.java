package DZ_12.Exercise_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class MyThreadChange extends Thread {
    String savePath;
    String world;

    public MyThreadChange(String name) {
        super(name);
    }

    private String changeWorld(String[] arr) {
        StringBuilder lines = new StringBuilder();
        for (String st : arr) {
            if (st.contains(this.world)) {
                st = "*******";
                lines.append(st);
            }
            lines.append(st);
        }
        return lines.toString();
    }

    public void run() {
        try {
            FileReader reader = new FileReader(this.savePath);
            BufferedReader buff = new BufferedReader(reader);
            StringBuilder linesNew = new StringBuilder();
            String line = "";
            String[] arrSt;
            while ((line = buff.readLine()) != null) {
                arrSt = line.split(" ");
                linesNew.append(changeWorld(arrSt));
            }
            FileWriter writer = new FileWriter(this.savePath);
            writer.write(linesNew.toString());
            System.out.println("Все запрещенные слова вырезаны!");
            reader.close();
            writer.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
