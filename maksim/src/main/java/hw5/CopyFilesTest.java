package hw5;

import java.io.File;
import java.io.IOException;

/**
 * Created by User on 21/12/2016.
 */
public class CopyFilesTest {

    public static void main(String[] args) throws IOException {
        File from = new File("C:\\Users\\User\\Desktop\\Java\\Test");
        File to = new File("C:\\Users\\User\\Desktop\\to.txt");
        //new RecursionCopyFiles().processFilesFromFolder(from,to);
        new NIORecursionCopyFiles().processFilesFromFolder(from,to);
    }
}
