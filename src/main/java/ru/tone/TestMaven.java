package ru.tone;

import java.io.*;
public class TestMaven {

    public static void main(String[] args) throws IOException {
        File filesave = new File("TestMaven");
        PrintWriter printWriter = new PrintWriter(filesave);

        printWriter.println("Hello");
        printWriter.println("Pavel " + "(Goo)");
        printWriter.close();

        FileReader fileReader = new FileReader("TestMaven");
        int c;
        while ((c = fileReader.read())!=-1){
            System.out.print((char) c);
        }
    }
}
