package DZ_12.Exercise_3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MyThreadCopy extends Thread {

    String pathOld;
    String pathNew;
    int count = 0;

    public MyThreadCopy(String name) {
        super(name);
    }

    private void CopyFiles(String oldDir, String paDir) throws IOException {
        File folder = new File(oldDir);
        File[] listFile = folder.listFiles();
        assert listFile != null;
        this.count += listFile.length;
        Path newDir = Paths.get(paDir);
        for (File file : listFile) {
            if (file.isDirectory()) {
                String pathO = file.getAbsolutePath();
                String pathN = paDir + "\\" + file.getName();
                Files.copy(file.toPath(), newDir.resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);
                CopyFiles(pathO, pathN);
            } else {
                try {
                    Files.copy(file.toPath(), newDir.resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }

    public void run() {
        try {
            CopyFiles(this.pathOld, this.pathNew);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
