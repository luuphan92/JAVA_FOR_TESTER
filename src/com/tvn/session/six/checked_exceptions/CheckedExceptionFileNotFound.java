package com.tvn.session.six.checked_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by user on 3/22/17 21:23.
 */
public class CheckedExceptionFileNotFound {
    public static void main(String args[]) throws FileNotFoundException{
        File file = new File("E://file.txt");
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
