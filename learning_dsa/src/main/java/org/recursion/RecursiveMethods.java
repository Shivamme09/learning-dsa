package org.recursion;

import java.util.ArrayList;

public class RecursiveMethods {

    public static int recursiveFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        int result = recursiveFactorial(n - 1);
        return result * n;
    }

    public static int recursiveSum(int number) {
        if (number == 1) {
            return 1;
        }
        int result = recursiveSum(number - 1);
        return result + number;
    }

    public static int recursiveFibonacci(int number) {
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        int result = recursiveFibonacci(number - 1) ;
        return result + recursiveFibonacci( number - 2) ;
    }
    public static void recursivePrintIncreasing(int term){
        if(term == 1){
            System.out.println(1);
            return ;
        }
        recursivePrintIncreasing(term - 1);
        System.out.println(term);
        return ;
    }
}
