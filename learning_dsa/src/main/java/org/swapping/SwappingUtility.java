package org.swapping;

public class SwappingUtility {

    public static void swapDigits(int n, int m){
        System.out.println("Number before swapping :"+ n +" " + m);
        int temp = n;
        n = m;
        m = temp;
        System.out.println("Number after swapping :"+ n +" " + m);
    }
    public static void swapNumbers(int[] array, int fromPosition, int toPosition) {
        int temp = array[fromPosition];
        array[fromPosition] = array[toPosition];
        array[toPosition] = temp;
    }
    public static void swapEntireArrays(int[] array) {
        int startPoint = 0 ;
        int endPoint = array.length - 1;
        while (startPoint < endPoint) {
            int temp = array[startPoint];
            array[startPoint] = array[endPoint];
            array[endPoint] = temp;
            startPoint++;
            endPoint--;
        }
    }
    public static void swapArraysPartly(int[] array, int startPoint, int endPoint) {
        while (startPoint < endPoint) {
            int temp = array[startPoint];
            array[startPoint] = array[endPoint];
            array[endPoint] = temp;
            startPoint++;
            endPoint--;
        }
    }
    public static int greaterNumbers(int[] array){
        int maxNum = array[0];
        int count = 0;
        for(int i = 0; i < array.length ; i++){
            if(array[i] > maxNum){
                maxNum = array[i];
            }
        }
        for(int i = 0; i < array.length ; i++){
            if(array[i] == maxNum){
                count++;
            }
        }
        return array.length - count;
    }
    public static boolean twoSumExists(int[] array,int sum){
        for(int i = 0 ; i < array.length - 1 ; i++){
            for(int j = i + 1 ; j < array.length ; j++){
                if(array[i] + array[j] == sum){
                    return true;
                }
            }
        }
        return false;
    }
    public static int maxNumber(int[] array) {
        int maxNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        return maxNum;
    }
}
