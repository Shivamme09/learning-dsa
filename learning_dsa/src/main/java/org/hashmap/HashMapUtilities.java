package org.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUtilities {
    public static void findFrequency(int[] setOfArrays, int[] queries) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < setOfArrays.length; i++) {
            if (hm.containsKey(setOfArrays[i])) {
                hm.put(setOfArrays[i], hm.get(setOfArrays[i]) + 1);
            } else {
                hm.put(setOfArrays[i], 1);
            }
        }
        for (int i = 0; i < queries.length; i++) {
            if (hm.containsKey(queries[i])) {
                System.out.print(hm.get(queries[i]) + " ");
            } else {
                System.out.print(0 + " ");
            }
        }
    }

    public static String twoSum(int[] array, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (hm.containsKey(array[i])) {
                hm.put(array[i], hm.getOrDefault(array[i], 1) + 1);
            }
        }
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            int b = target - a;
            if (a != b && hm.containsKey(b)) {
                return "Y";
            } else if (a == b && hm.get(array[i]) >= 2) {
                return "Y";
            }
        }
        return "N";
    }

    public static int[] twoSumWithIndexes(int[] array, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            int b = target - a;
            if (hm.containsKey(b)) {
                return new int[]{hm.get(b), i};
            }
            hm.put(a, i);
        }
        return new int[]{-1, -1}; // No solution found
    }
}
