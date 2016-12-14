package com.cbs.edu.solutions.hw05.tree_walk;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        Queue<File> files = new LinkedList<>();
        ArrayList<String> filenames = new ArrayList<>();
        File rootFile = new File(root);
        files.add(rootFile);
        while (!files.isEmpty()) {
            File peekFile = files.poll();
            if (peekFile.isDirectory()) {
                for (File innerFile : peekFile.listFiles()) {
                    files.add(innerFile);
                }
            } else {
                filenames.add(peekFile.getAbsolutePath());
            }
        }
        return filenames;
    }

    public static List<String> getFileTree(File root, List<String> files) throws IOException {
        if (root.isDirectory()) {
            for (File file : root.listFiles()) {
                getFileTree(file, files);
            }
        } else {
            files.add(root.getAbsolutePath());
        }
        return files;
    }

    public static void main(String[] args) throws IOException
    {
        /*for (String s : getFileTree("C:\\Users\\Evgeniy\\Desktop\\JavaRushHomeWork\\src\\com\\javarush\\test\\level31\\lesson02\\tree_walk\\fs"))
        {
            System.out.println(s);
        }*/
        ArrayList<String> filenames = new ArrayList<>();
        List<String> fileTree = getFileTree(new File("C:\\\\Users\\\\Evgeniy\\\\Desktop\\\\JavaRushHomeWork\\\\src\\\\com\\\\javarush\\\\test\\\\level31\\\\lesson02\\\\tree_walk\\\\fs"), filenames);
        for (String s : fileTree)
        {
            System.out.println(s);
        }
    }
}
