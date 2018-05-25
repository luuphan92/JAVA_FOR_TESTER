package com.tvn.session.loop_control;

/**
 * Created by user on 5/11/17 20:46.
 */
public class ReturnArrayFromMethod {

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] reverseNums = reverse(nums);

        for(int num : reverseNums) {
            System.out.print(num + " ");
        }
    }
}
