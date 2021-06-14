package Singleton;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Singleton {
    private static Singleton instance = null;

    private Singleton(){}


    synchronized public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void writeToFile(String fileContent) throws IOException {
        String filePath = "log.txt";
        Files.writeString(Path.of(filePath), fileContent + "\n", StandardOpenOption.APPEND);
    }
}

