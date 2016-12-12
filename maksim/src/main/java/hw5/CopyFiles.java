package hw5;

import java.io.*;

/**
 * Created by User on 12/12/2016.
 */
public class CopyFiles {
    public static void main(String[] args) {
        File  folder = new File("C:\\Users\\User\\IdeaProjects\\java-professional-02\\maksim\\src\\main\\java\\hw5");
        File[] folderEntries = folder.listFiles();

            for (File entry : folderEntries)
            {
                if (entry.getName().lastIndexOf(".txt")!=-1 )
                {
                    try (FileReader is = new FileReader(entry);
                         RandomAccessFile os = new RandomAccessFile("C:\\Users\\User\\IdeaProjects\\java-professional-02\\maksim\\src\\main\\java\\hw5\\Files.txt","rw"))
                    {
                        BufferedReader reader = new BufferedReader(is);
                        String s= reader.readLine();
                        while (reader.readLine()!=null) {
                            os.write(s.getBytes());
                        }
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                        }

                }

            }
        }









}
