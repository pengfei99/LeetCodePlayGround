package org.pengfei.problems.algo.P01_TwoSum;

import java.util.Arrays;

public class TwoSumMain {
    public static void main(String[] args){

        //vars for benchmark
        long start,end;


        int[] nums=new int[]{2,6,7,8,9,3};
        int target=5;

        //Solution1
        start=System.nanoTime();
        int[] result1=Solution01.twoSum(nums,target);
        end=System.nanoTime();
        System.out.println("Solution 1 uses: "+(end-start));
        System.out.println("Solution 1 returns: "+(Arrays.toString(result1)));

        start=System.nanoTime();
        int[] result2=Solution02.twoSum(nums,target);
        end=System.nanoTime();
        System.out.println("Solution 2 uses: "+(end-start));
        System.out.println("Solution 2 returns: "+(Arrays.toString(result2)));

        start=System.nanoTime();
        int[] result3=Solution03.twoSum(nums,target);
        end=System.nanoTime();
        System.out.println("Solution 3 uses: "+(end-start));
        System.out.println("Solution 3 returns: "+(Arrays.toString(result3)));
    }

}
