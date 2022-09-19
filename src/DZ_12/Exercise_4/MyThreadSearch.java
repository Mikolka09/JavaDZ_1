package DZ_12.Exercise_4;

import java.io.*;

public class MyThreadSearch extends Thread {
    String path;
    String savePath;
    String world;

    public MyThreadSearch(String name) {
        super(name);
    }

    private boolean findWorld(String[] arr) {
        for (String st : arr) {
            if (st.contains(this.world))
                return true;
        }
        return false;
    }

    private void writeFile(String lines) throws IOException {
        try {
            FileWriter writer = new FileWriter(this.savePath);
            writer.write(lines + "\n");
            System.out.println("Текст файла записан для последующей цензуре!");
            writer.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    private void searchWorld(String pathFile) throws FileNotFoundException {
        try {
            FileReader reader = new FileReader(pathFile);
            BufferedReader buff = new BufferedReader(reader);
            StringBuilder lines = new StringBuilder();
            String line = "";
            String[] arrSt;
            boolean flag = false;
            while ((line = buff.readLine()) != null) {
                arrSt = line.split(" ");
                if (findWorld(arrSt)){
                    flag = true;
                    System.out.println("Запрещенный файл найден!");
                }
                lines.append(line);
            }
            if (flag) {
                writeFile(lines.toString());
            }
            reader.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }

    public void run() {
        try {
            File folder = new File(this.path);
            File[] listFiles = folder.listFiles();
            assert listFiles != null;
            for (File file : listFiles) {
                searchWorld(file.getAbsolutePath());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
