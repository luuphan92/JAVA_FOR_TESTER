package com.tvn.session.random;

import java.util.Random;

/**
 * Created by user on 3/9/17 12:59 AM.
 */
public class JavaUltilRandom {
    public static void main(String[] args) {
        Random generate = new Random();

        //example
        boolean randomBoolean = generate.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);
        
        int randomInt = generate.nextInt();
        System.out.println("randomInt = " + randomInt);
        
        int randomIntRange = generate.nextInt(12);
        System.out.println("randomIntRange = " + randomIntRange);
        
        long randomLong = generate.nextLong();
        System.out.println("randomLong = " + randomLong);
        
        float randomFloat = generate.nextFloat();
        System.out.println("randomFloat = " + randomFloat);
        
        double randomDouble = generate.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

    }
}
