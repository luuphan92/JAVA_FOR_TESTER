package com.tvn.quiz.exercises.exercise14;

import java.io.*;

/**
 * Created by user on 5/21/17 10:35.
 */
public class Exercise14_3 {
    public static void main(String[] args) throws IOException {
        countNotBlankLine();
    }

    private static void countNotBlankLine() throws IOException {
        String dirPath = System.getProperty("user.dir");
        String filePath = dirPath + File.separator + "files" + File.separator;

        File file = new File(filePath + "blank.txt");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String s;
        int count = 0;

        while ((s = br.readLine()) != null) {
            if (!s.isEmpty()) {
                count++;
            }
        }

        br.close();
        fr.close();

        String toBe = count > 1 ? "are" : "is";
        String line = count > 1 ? "lines" : "line";

        System.out.println("Number of " + line + " " + toBe + " :" + " " + count);
    }
}
