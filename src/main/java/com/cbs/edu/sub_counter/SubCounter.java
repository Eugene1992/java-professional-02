package com.cbs.edu.sub_counter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SubCounter {

    private File input;
    private File excluded;
    private int totalWords;
    private int totalUniqueWords;

    public SubCounter(File input, File excluded) {
        this.input = input;
        this.excluded = excluded;
    }

    private List<String> readInputText() throws IOException {
        return Files
                .readAllLines(Paths.get(input.getAbsolutePath()))
                .stream()
                .map(s -> s.replaceAll("(?U)[^a-zA-Z]", " "))
                .map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .filter(s -> !s.isEmpty() && s.length() >= 4)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    private Set<String> readExcludedWords() throws IOException {
        return Files
                .readAllLines(Paths.get(excluded.getAbsolutePath()))
                .stream()
                .map(s -> s.split(" "))
                .flatMap(array -> Arrays.stream(array))
                .collect(Collectors.toSet());
    }

    private Map<String, Integer> countWords() throws IOException {
        Set<String> excludedWords = readExcludedWords();
        List<String> inputWords = readInputText();
        totalWords = (int) inputWords.stream().filter(s -> !excludedWords.contains(s)).count();
        totalUniqueWords = (int) inputWords.stream().filter(s -> !excludedWords.contains(s)).distinct().count();

        return inputWords
                .stream()
                .filter(s -> !excludedWords.contains(s))
                .distinct()
                .collect(Collectors.toMap(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s;
                    }
                }, new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Collections.frequency(inputWords, s);
                    }
                }));
    }

    private static <K, V extends Comparable<V>> Map<K, V> sortTreeMapByValues(final Map<K, V> map) {
        Map<K, V> sortedByValues = new TreeMap<>((k1, k2) -> {
            int compare = map.get(k2).compareTo(map.get(k1));
            return compare == 0 ? 1 : compare;
        });
        sortedByValues.putAll(map);
        return sortedByValues;
    }

    public void printResult() throws IOException {
        Set<Map.Entry<String, Integer>> entries = sortTreeMapByValues(countWords()).entrySet();
        System.out.println("Total words: " + totalWords);
        System.out.println("Total unique words: " + totalUniqueWords);
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            String line = String.format("%s\t:\t%d\t:\t%.2f%%", key, value, value / (double) totalWords * 100);
            System.out.println(line);
        }
    }
}
