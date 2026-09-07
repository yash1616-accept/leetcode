class Solution {
    public int distinctSubseqII(String s) {
        int MOD = 1_000_000_007;
        int total =0;
        int end[]= new int [26];//for tracking total subsequence
        for(char ch: s.toCharArray()){
            int idx=ch-'a';
            int oldtotal =total;
            int newsubsequence=(total +1-end[idx]+MOD)%MOD;
            //+1 for empty str adding into existing str and -end[idx] if duplicate char commes 
            total =(total+newsubsequence)%MOD;
            end[idx]=(end[idx]+newsubsequence)%MOD;
        }
        return total;
    }
}