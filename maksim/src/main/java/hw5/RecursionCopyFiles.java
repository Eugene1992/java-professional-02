package hw5;

import java.io.*;


/**
 * Created by User on 12/12/2016.
 */
public class RecursionCopyFiles
{
    public  void processFilesFromFolder(File from,File to)
    {
        if(from.isDirectory())
        {
            File[] folderEntries = from.listFiles();
            for (File entry : folderEntries) {
                if (entry.isFile()) {
                    thisISFile(entry, to);
                }

                else  processFilesFromFolder(entry, to);
            }
        }

        else{
            thisISFile(from,to);
        }
    }

    public  void thisISFile(File file, File to)
        {
            if (file.toString().endsWith(".txt")) {
                try (InputStream is = new FileInputStream(file);
                     OutputStream os = new FileOutputStream(to,true)) {
                    byte[] buf = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = is.read(buf)) > 0) {
                        os.write(buf, 0, bytesRead);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
}


