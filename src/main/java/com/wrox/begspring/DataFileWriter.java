package com.wrox.begspring;

import java.io.*;

public class DataFileWriter implements ResultWriter {
    public void showResult(String result) {
        File file = new File("output.txt");
        try {
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file)));
            printWriter.println(result);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
