class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int answer = 0;
        int n = img1.length;
        for (int down = -(n - 1); down <= n - 1; down++) {
            for (int right = -(n - 1); right <= n - 1; right++) {
                int count = 0;
                for (int row = 0; row < n; row++) {
                   for(int col = 0;col < n;col++){
                    if(img1[row][col]==1){
                        int newRow=row+down;
                        int newcol =col+right;
                        if(newRow>=0 && newRow<n && newcol>=0 && newcol<n &&
img2[newRow][newcol]==1){
                            count++;
                        }
                    }
                   }
                }
                answer=Math.max(answer,count);
            }
        }
        return answer;
    }
}