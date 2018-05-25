package com.tvn.session.two.Arry;

/**
 * Created by user on 2/23/17 1:47 PM.
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
