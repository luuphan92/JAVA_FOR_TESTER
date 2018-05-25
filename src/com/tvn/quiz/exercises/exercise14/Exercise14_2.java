package com.tvn.quiz.exercises.exercise14;

import java.io.*;

/**
 * Created by user on 3/10/17 02:49.
 */
public class Exercise14_2 {
    public static void main(String[] args) throws IOException {
        compareFile();
    }

    private static void compareFile() throws IOException {
        String dirPath = System.getProperty("user.dir");
        String filePath = dirPath + File.separator + "files" + File.separator;

        File compare = new File(filePath + "compare.txt");
        File compare1 = new File(filePath + "compare1.txt");
        File compare2 = new File(filePath + "compare2.txt");

        compare.createNewFile();

        FileWriter writer = new FileWriter(compare);
        BufferedWriter buffer = new BufferedWriter(writer);
        PrintWriter printWriter = new PrintWriter(buffer);

        FileReader fr1 = new FileReader(compare1);
        BufferedReader br1 = new BufferedReader(fr1);

        String sCompare1;
        String sCompare2;
        int count = 0;

        while ((sCompare1 = br1.readLine()) != null){
            FileReader fr2 = new FileReader(compare2);
            BufferedReader br2 = new BufferedReader(fr2);
            while ((sCompare2 = br2.readLine()) != null){
                if (sCompare1.equals(sCompare2)){
                    printWriter.println(sCompare1);
                    count++;
                    br2.close();
                    fr2.close();
                    break;
                }
            }
        }

        System.out.println("Found " + count + " duplicate username. Please check the compare.txt");

        printWriter.close();
        buffer.close();
        writer.close();
        br1.close();
        fr1.close();
    }
}
