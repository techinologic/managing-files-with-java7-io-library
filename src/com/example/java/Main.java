package com.example.java;

import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.File;

public class Main {

    public static void main(String[] args) {


        File sourceFile = new File("files/loremipsum.txt");
        File targetFile = new File("files/target.txt");
        try {
            FileUtils.copyFile(sourceFile, targetFile);
            System.out.println("file copied.");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
