package com.tenzo.projJava.crushcourse.kharchenko;

import java.util.*;

public class Task2 {

    public void showDaysInMonth(int month) {
        ArrayList<Integer> daysInMonths = new ArrayList<Integer>();
        Collections.addAll(daysInMonths, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);

        System.out.println(daysInMonths.get(month - 1));
    }

    public int sum(int[] nums) {
        int theSum = 0;
        for (int i = 0; i < 5; i++) {
            theSum += nums[i];
        }

        return theSum;
    }

    public String findSecondPositiveNumAndMinimum(int[] nums) {
        int count = 0;
        String res = null;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                count++;
                if (count == 2) {
                    res = "The second positive num is " + nums[i] + " on position " + i + " in array.";
                }
            }
        }
        OptionalInt min = Arrays.stream(nums).min();
        int minAsInt = min.getAsInt();
        res += "\nThe minimum num in array is " + minAsInt;
        return res;
    }

    public void productNums(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            int s = 1;
            int a = nums.get(i);
            if (a % 2 == 0){
                s = s * a;
                System.out.println("The product of " + a + " is " + s);
            }
        }

    }
}
