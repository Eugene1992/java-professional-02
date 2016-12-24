package hw5;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Created by Максим on 20-Dec-16.
 */
public class SavePictures {
    public void saveFromURL(String url, String fileName) {
        try {
            URL siteUrl = new URL(url);
            Document doc = Jsoup.connect(String.valueOf(siteUrl)).get();
            List<Element> elms = doc.select("a[href]");
            for (Element img : elms) {
                String image = img.attr("href");
                String file = image.substring(image.lastIndexOf("/") + 1);
                int i = url.toString().lastIndexOf("com");
                String s = url.toString().substring(0, i + 3) + image;
                URL pictureURL = new URL(s);
                try (BufferedInputStream rd = new BufferedInputStream(pictureURL.openConnection().getInputStream());
                     FileOutputStream os = new FileOutputStream(new File(fileName + file))) {
                    int bytesRead;
                    while ((bytesRead = rd.read()) != -1) {
                        os.write(bytesRead);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}