class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int i=0,j=0;
        int n= arr.length;
        int currsum =0;
        int minBestLengthTillidx []= new int[n];
        Arrays.fill(minBestLengthTillidx,Integer.MAX_VALUE);
        int bestMinLen=Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;
        while(j<n){
           currsum+=arr[j];
           while( i<j && currsum>target){
            currsum-=arr[i++];
           }
           if(currsum==target){
            int len = j-i+1;
            if(i>0 && minBestLengthTillidx[i-1]!=Integer.MAX_VALUE){

            result=Math.min(result,minBestLengthTillidx[i-1]+len);
            }
            bestMinLen=Math.min(bestMinLen,len);
           }
           minBestLengthTillidx[j]=bestMinLen;
           j++;
        }
        if(result==Integer.MAX_VALUE)return -1;
        return result;
    }
}