package com.fda.dp.oneD;

public class Rob {

    public static void main(String[] args) {
        int [] s = {20,25,30,15,10};
        Rob r =new Rob();
        int i = maxProfitDP(s);
        System.out.println(i);
    }

    public static int maxProfitDP(int[] S){
        int N = S.length;
        int[] dp = new int[N+1];
        dp[1] = S[0];
        for(int i=2;i<=N;i++){
            dp[i] = Math.max(S[i-1]+dp[i-2],dp[i-1]);
        }
        return dp[N];
    }
}
