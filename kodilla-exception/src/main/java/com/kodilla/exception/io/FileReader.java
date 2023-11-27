package com.kodilla.exception.io;

import java.io.File;

public class FileReader {

    public void readFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("names.txt").getFile());

        System.out.println(file.getPath());
    }
}