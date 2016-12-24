package hw5;


import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


/**
 * Created by User on 21/12/2016.
 */
public class NIORecursionCopyFiles {


    public void processFilesFromFolder(File from, File to) throws IOException {
        if (from.isDirectory()) {
            File[] folderEntries = from.listFiles();
            for (File entry : folderEntries) {
                if (entry.isFile()) {
                    thisIsFile(entry, to);
                } else processFilesFromFolder(entry, to);
            }
        } else {
            thisIsFile(from, to);
        }
    }

    public void thisIsFile(File file, File to) throws IOException {
        if (file.toString().endsWith(".txt")) {
            Path path = Paths.get(String.valueOf(file));
            byte[] data = Files.readAllBytes(path);
            String content = new String(data, StandardCharsets.UTF_8);
            Path logFile = to.toPath();
            try (BufferedWriter writer = Files.newBufferedWriter(logFile, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
                writer.write(content);
            }
        }
    }

}
