package com.cbs.edu.solutions.hw05.download_master;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        final String URL = "http://flangex.herokuapp.com/io/load";
        final String PATH_TO_SAVE = "C:\\Users\\Evgeniy\\Desktop\\java-professional-02\\src\\main\\java\\com\\cbs\\edu\\solutions\\hw05\\download_master";
        final String EXTENSION = ".png";

        SimpleDownloadMaster simpleDownloadMaster = new SimpleDownloadMaster(URL, PATH_TO_SAVE, EXTENSION);
        simpleDownloadMaster.load();
    }
}
