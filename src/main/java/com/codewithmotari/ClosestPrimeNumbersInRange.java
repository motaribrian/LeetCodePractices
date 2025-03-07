/*

Given two positive integers left and right, find the two integers num1 and num2 such that:

left <= num1 < num2 <= right .
Both num1 and num2 are prime numbers.
        num2 - num1 is the minimum amongst all other pairs satisfying the above conditions.
Return the positive integer array ans = [num1, num2]. If there are multiple pairs satisfying these conditions, return the one with the smallest num1 value. If no such numbers exist, return [-1, -1].



Example 1:

Input: left = 10, right = 19
Output: [11,13]
Explanation: The prime numbers between 10 and 19 are 11, 13, 17, and 19.
The closest gap between any pair is 2, which can be achieved by [11,13] or [17,19].
Since 11 is smaller than 17, we return the first pair.
*/


package com.codewithmotari;

import java.util.Set;
import java.util.TreeSet;

public class ClosestPrimeNumbersInRange {
    public int[] closestPrimes(int left, int right) {
        int num1=-1 , num2=-1;
        Set<Integer> prime=new TreeSet<>();
        //add prime numbers to treeset
        for (int i=left;i<right;i++){
            if(isprime(i)){
                prime.add(i);
            }
        }
        return new int[2];
    }
    public boolean isprime(int n){
        if(n<1){
            return false;
        }

        // Check from 2 to n-1
        for (int i = 2; i < n; i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
