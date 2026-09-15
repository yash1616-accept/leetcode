class Solution {
    boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        i++;
        j--;
        }
        return true;
    }

    // int solve(String s,int k ,int i,int j,int dp[][]){
    //     int n=s.length();
    //  if(i>=n||j>=n)return 0;
    //  if(dp[i][j]!=-1)return dp[i][j];
    //    if(isPalindrome(s,i,j)){
    //   int  take=1+solve(s,k,j+1,j+k,dp);
    //   int grow=solve(s,k,i,j+1,dp);
    //   int slide= solve(s,k,i+1,j+1,dp);
    //    return dp[i][j]=Math.max(take,Math.max(grow,slide));
    //    }
    //    int grow= solve(s,k,i,j+1,dp);
    //    int slide = solve(s,k,i+1,j+1,dp);
    //    return dp[i][j]= Math.max(grow,slide);

    // }

    public int maxPalindromes(String s, int k) {
        int n =s.length();//bottom up approach 
        if(k==1)return n;
         int [][] dp= new int [n+1][n+1];
        // for(int []row:dp){
        //     Arrays.fill(row,-1);
        // }
        for(int i=n-1;i>=0;i--){
            for(int j =n-1;j>=0;j--){
                if(isPalindrome(s,i,j)){
                    int take= 1+(j+k<=n ? dp[j+1][j+k] : 0);//j+k can go out of bound 
                    int grow= dp[i][j+1];
                    int slide = dp[i+1][j+1];
                    dp[i][j]=Math.max(take,Math.max(grow,slide));
                }else{
                    int grow =dp[i][j+1];
                    int slide = dp[i+1][j+1];
                    dp[i][j]=Math.max(dp[i][j],Math.max(grow,slide));
                }
            }
        }
            return dp[0][k-1];
    }
}