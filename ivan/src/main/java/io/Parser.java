package io;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Parser {
    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://flangex.herokuapp.com/io/load").get();
        Elements links = doc.select("#links a.btn-sm[href]");


        for (Element link : links) {
            System.out.println(link.attr("href"));
            String[] substring = link.attr("href").split("/");
            String fileName = substring[substring.length-1];
            saveUrl( "D:\\Users\\osven\\Desktop\\" + fileName,"http://flangex.herokuapp.com" + link.attr("href"));
        }


        System.out.print("http://flangex.herokuapp.com/io/load");
    }

    public static void saveUrl(final String filename, final String urlString)
            throws MalformedURLException, IOException {
        BufferedInputStream in = null;
        FileOutputStream fout = null;
        try {
            in = new BufferedInputStream(new URL(urlString).openStream());
            fout = new FileOutputStream(filename);

            final byte data[] = new byte[1024];
            int count;
            while ((count = in.read(data, 0, 1024)) != -1) {
                fout.write(data, 0, count);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (fout != null) {
                fout.close();
            }
        }
    }
}

