package com.tvn.quiz.exercises.exercise14;

import java.io.*;

/**
 * Created by user on 5/21/17 10:55.
 */
public class Exercise14_4 {
    public static void main(String[] args) throws IOException {
        removeBlankLine();
    }

    private static void removeBlankLine() throws IOException {
        String dirPath = System.getProperty("user.dir");
        String filePath = dirPath + File.separator + "files" + File.separator;

        File blankFile = new File(filePath + "blank.txt");
        File blankRemoveFile = new File(filePath + "blank_remove.txt");

        blankRemoveFile.createNewFile();

        FileReader fr = new FileReader(blankFile);
        BufferedReader br = new BufferedReader(fr);
        String s;

        FileWriter fw = new FileWriter(blankRemoveFile);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        while ((s = br.readLine()) != null) {
            if (!s.isEmpty()) {
                pw.println(s);
            }
        }

        br.close();
        fr.close();
        pw.close();
        bw.close();
        fw.close();

        System.out.println("Removed all blank lines, please check the file blank_remove.txt");
    }
}
