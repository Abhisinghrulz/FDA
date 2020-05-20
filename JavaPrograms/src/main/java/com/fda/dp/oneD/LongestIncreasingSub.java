package com.fda.dp.oneD;

public class LongestIncreasingSub {
    private static int lis(int i, int[] A) {
        if (i == 0) {
            return 1;
        }
        int max = 0;
        for (int j = 0; j < i; j++) {
            int lis = lis(j, A);
            if (A[i] > A[j]) {
                lis += 1;
            }
            max = Math.max(max, lis);
        }
        return max;
    }

    public static void main(String[] args) {
        int lis = lisDP( new int[]{5, 2, 7, 3, 6, 8});
        System.out.println(lis);
    }

    public static int lisDP(int[] A) {
        int N = A.length;
        int[] dp = new int[N];
        dp[0] = 1;
        for (int i = 1; i < N; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                int lis = dp[j];
                if (A[i] > A[j]) {
                    lis += 1;
                }
                dp[i] = Math.max(dp[i], lis);
            }
        }
        return dp[N - 1];
    }
}