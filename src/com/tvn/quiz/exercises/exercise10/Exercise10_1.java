package com.tvn.quiz.exercises.exercise10;

/**
 * Created by user on 2/23/17 8:11 PM.
 */
public class Exercise10_1 {

    public static void print2DArray(int[][] array){
        for (int i = 0; i < array.length; i ++){
            for (int j = 0; j < array[i].length; j ++){
                System.out.print(array[i][j] + ",");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] numberTriangle = new int[11][];

        for (int row = 0; row < numberTriangle.length; row++){
            numberTriangle[row] = new int[row + 1];
            for (int j = 0; j < numberTriangle[row].length; j ++){
                numberTriangle[row][j] = j;
            }
        }

        print2DArray(numberTriangle);
    }
}
