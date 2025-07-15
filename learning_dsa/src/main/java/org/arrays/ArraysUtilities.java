package org.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUtilities {

    public static int[] createArrays(int size, Scanner scanner) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Elements of Array..");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Arrays Created..");
        return arr;
    }

    public static void printArrays(int[] array) {
        System.out.print("Elements of array->");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int sumOfArrays(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
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

    public static int greaterNumbers(int[] array) {
        int maxNum = array[0];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxNum) {
                count++;
            }
        }
        return array.length - count;
    }

    //print arrays row-wise
    public static void rowWisePrint(int[][] array, int rowSize, int columnSize) {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    //print arrays column-wise
    public static void columnWisePrint(int[][] array, int rowSize, int columnSize) {
        for (int j = 0; j < columnSize; j++) {
            for (int i = 0; i < rowSize; i++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void zigZagPrint(int[][] array, int rowSize, int columnSize) {
        for (int i = 0; i < rowSize; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < columnSize; j++) {
                    System.out.print(array[i][j] + " ");
                }
            } else {
                for (int j = columnSize - 1; j >= 0; j--) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static int findUnique(int[] array){
        int unique = 0;
        for(int i = 0; i < array.length; i++){
            unique = unique ^ array[i];
        }
        return unique;
    }
    public static int minRemovalOrder(int[] arrays){
        Arrays.sort(arrays);
        int minSum = 0;
        for(int i = arrays.length - 1; i >= 0; i--){
            minSum += arrays[i] * (arrays.length - i);
        }
        return minSum;
    }
    public static int findGoodInteger(int[] arrays){
        Arrays.sort(arrays);
        int result = 0;
        for(int i = 0; i < arrays.length; i++){
            if(i == arrays[i]){
                result++;
            }
        }
        return result;
    }
    public static int findGoodIntegerInDuplicates(int[] array){
        int result = 0;
        int lesserNumbers = 0;
        Arrays.sort(array);
        for(int i = 1; i < array.length; i++){
            //check for index zero
            if(array[i - 1] == 0 && i - 1 == 0){
                result ++;
            }
            // check for first occurance
            if(array[i] != array[i - 1] ){
                lesserNumbers = i;
            }
            if(array[i] == lesserNumbers){
                result++;
            }
        }
        return result;
    }
}
