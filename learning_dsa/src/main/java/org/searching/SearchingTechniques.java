package org.searching;

public class SearchingTechniques {
    public static boolean binarySearch(int[] array, int key) {
        boolean result = false;
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == key) {
                result = true;
                return result;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static int findFloor(int[] array, int key) {
        int ans = Integer.MIN_VALUE;
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == key) {
                return array[mid];
            } else if (array[mid] < key) {
                if (array[mid] > ans) {
                    ans = array[mid];
                    low = mid + 1;
                }
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // Duplicates are adjacent to each other
    public static int findUniqueElement(int[] arrays) {
        int low = 0;
        int high = arrays.length - 1;
        int mid = low + (high - low) / 2;
        if (arrays[low] != arrays[low + 1]) {
            return arrays[low];
        }
        if (arrays[high] != arrays[high - 1]) {
            return arrays[high];
        }
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arrays[mid] != arrays[mid - 1] && arrays[mid] != arrays[mid + 1]) {
                return arrays[mid];
            }
            if (arrays[mid] == arrays[mid - 1]) {
                mid = mid - 1;
            }
            if (mid % 2 == 0) {
                low = low + 2;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
