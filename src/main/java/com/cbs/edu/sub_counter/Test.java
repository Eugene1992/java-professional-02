package com.cbs.edu.sub_counter;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        SubCounter subCounter = new SubCounter(
//                new File("src\\main\\java\\com\\cbs\\edu\\sub_counter\\Friends - 1x13.txt"),
                new File("src\\main\\java\\com\\cbs\\edu\\sub_counter\\Game of Thrones - 06x08.txt"),
//                new File("src\\main\\java\\com\\cbs\\edu\\sub_counter\\Game of Thrones - 06x09.txt"),
//                new File("src\\main\\java\\com\\cbs\\edu\\sub_counter\\Game of Thrones - 03x02.txt"),
                new File("src\\main\\java\\com\\cbs\\edu\\sub_counter\\ExcludedWords.txt")
        );

        subCounter.printResult();
    }
}
