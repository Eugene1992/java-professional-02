package stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class ParseFile {

    public static List<Statistics> parseFile(String file) throws IOException {
        return Files.lines(Paths.get(file))
                .map(s -> parseLine(s))
                .collect(Collectors.toList());
    }

    public static List<Statistics> parseFileFilterByDate(String file, LocalDate from, LocalDate to) throws IOException {
        return Files.lines(Paths.get(file))
                .map(s -> parseLine(s)).filter(s -> s.getDate().isAfter(from) && s.getDate().isAfter(to))
                .collect(Collectors.toList());
    }

    public static Statistics parseLine(String s) {
        String[] line = s.split("\\\t");
        LocalDate date = LocalDate.parse(line[0].split(" ")[0]);
        float numberOne = Float.parseFloat(line[1]);
        float numberTwo = Float.parseFloat(line[2]);
        float numberThree = Float.parseFloat(line[3]);
        float numberFour = Float.parseFloat(line[4]);
        float numberFive = Float.parseFloat(line[5]);
        float numberSix = Float.parseFloat(line[6]);
        return new Statistics(date, numberOne, numberTwo, numberThree, numberFour, numberFive, numberSix);
    }

    public static void main(String[] args) throws IOException {
        List<Statistics> file = parseFile("D:\\Users\\osven\\Desktop\\java-professional-02\\src\\trafic_logs\\data");
        System.out.printf(file.toString());

        List<Statistics> fileFilter =
                parseFileFilterByDate("D:\\Users\\osven\\Desktop\\java-professional-02\\src\\trafic_logs\\data",
                        LocalDate.parse("2016-11-01"), LocalDate.parse("2016-12-01"));
        System.out.printf(fileFilter.toString());


    }
}
