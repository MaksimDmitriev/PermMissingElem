package com.app;

public class Solution {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length + 1;
        long sum = (1 + N) * N / 2;
        long res = sum;
        for (int elem : A) {
            res -= elem;
        }
        return (int) res;
    }
}
