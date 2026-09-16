class Solution {
    long mod = 1_000_000_007l;
    int dp[][] = new int[1001][1001];

    // public int solve(int n, int k, int i, int dp[][]) {
    //     if (k == 0) {
    //         return 1;
    //     }
    //     if (i >= n) {
    //         return 0;
    //     }
    //     if (dp[k][i] != -1)
    //         return dp[k][i];

    //     long skip = (int) ((solve(n, k, i + 1, dp)) % mod);
    //     long take = 0;
    //     for (int j = i + 1; j <= n - 1; j++) {
    //         take = (int) ((take + solve(n, k - 1, j, dp)) % mod);
    //     }
    //     return dp[k][i] = (int) ((skip + take) % mod);
    // }

    public int numberOfSets(int n, int k) {
        // for(int [] row:dp){
        //   Arrays.fill(row,-1);
        // }

        //   return (int)(solve(n,k,0,dp)%mod);
        int[][] dp = new int[k + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            dp[0][i] = 1;
        }
        for (int K = 1; K <= k; K++) {
            int prevrow[]= new int [n+1];
            for(int x=n-1;x>=0;x--){
             prevrow[x]=(int) ((prevrow[x+1]+dp[K-1][x])%mod);
            }
            for (int i = n - 1; i >= 0; i--) {
                int take = 0;
                take =(int)((take+prevrow[i+1])%mod);
                // for (int j = i + 1; j <= n - 1; j++) {
                //     take = (int)((take + dp[K - 1][j]) % mod);
                // }
                int skip = dp[K][i + 1];
                dp[K][i]=(int)((skip+take)%mod);
            }
        }
        return dp[k][0];
    }
}