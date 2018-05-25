package com.tvn.session.six.Debug;

/**
 * Created by user on 3/23/17 20:33.
 */
public class DebuggingDemo {

    public static void main (String args[]) {
        g(2);
        g(3); // <----------------------------------- step out of
    }

    static void g (int x) {
        f(x);    // <----------------------------------- current location
        f(1); // <----------------------------------- step over
    }

    static void f (int x) {
        System.out.println ("num is: " + x); // <---- step into
    }


}