package com.gf.dspn.leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Code1 {

    private int[] arrs = {2, 7, 11, 15};

    /*public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; //i,j保存的是数组的下标
                }
            }
        }
        return new int[0];
    }*/

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Code1 code1 = new Code1();
        Long start = System.currentTimeMillis();
        int[] receiveArrs = code1.twoSum(code1.arrs, 9);
        Long end = System.currentTimeMillis();
        System.out.println("start:" + start);
        System.out.println("end:" + end);
        System.out.println("end-start:" + (end - start));

        Integer[] integerArras = new Integer[receiveArrs.length];
        for (int i = 0; i < receiveArrs.length; i++) {
            integerArras[i] = receiveArrs[i];
        }

        Arrays.asList(integerArras).stream().forEach(n -> System.out.println(n));

    }
}
