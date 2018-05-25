package com.tvn.session.six.unchecked_exceptions;

import java.util.Random;

/**
 * Created by user on 3/23/17 01:04.
 */
public class MultiCatchBlockError {
    public static void main(String args[]){
        try{
            int a[] = new int[5];
            int i = new Random().nextInt(2);
            a[5]=30/i;
        }
        catch(Exception e){ System.out.println("This is for another exception"); }
//        catch(ArithmeticException e){ System.out.println("This is from catch 1"); }
//        catch(ArrayIndexOutOfBoundsException e){ System.out.println("This is from catch 2"); }

        System.out.println("This is another code outside of the try/catch");
    }
}
