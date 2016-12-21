package hw5;

import java.io.File;

/**
 * Created by User on 21/12/2016.
 */
public class CopyFilesTest {

    public static void main(String[] args) {
        File from = new File("C:\\File");
        File to = new File("C:\\Users\\Максим\\Desktop\\to.txt");
        new RecursionCopyFiles().processFilesFromFolder(from,to);
    }
}
