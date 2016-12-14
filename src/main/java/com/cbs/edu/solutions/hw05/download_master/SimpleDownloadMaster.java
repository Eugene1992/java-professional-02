package com.cbs.edu.solutions.hw05.download_master;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class SimpleDownloadMaster {

    private final String URL;
    private final String PATH_TO_SAVE;
    private final String EXTENSION;
    private InputStream in;
    private OutputStream out;

    public SimpleDownloadMaster(String url, String pathToSave, String extension) {
        URL = url;
        PATH_TO_SAVE = pathToSave;
        EXTENSION = extension;
    }

    public void load() throws IOException {
        int fileCount = 0;
        for (String link : getParsedLinks()) {
            in = new URL(link).openConnection().getInputStream();
            String filename = String.format("%s\\%s_%d.%s",
                    PATH_TO_SAVE,
                    LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyy_hh-mm-ss")),
                    ++fileCount,
                    EXTENSION);
            out = new FileOutputStream(new File(filename));
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buf)) > 0) {
                out.write(buf, 0, bytesRead);
            }
            out.close();
            in.close();
        }
    }

    public Set<String> getParsedLinks() throws IOException {
        Set<String> links = new HashSet<>();
        Document doc = Jsoup.connect(URL).get();
        Elements elements = doc.select("fs");
        for (Element element : elements) {
            links.add(element.absUrl("href"));
        }
        return links;
    }
}
