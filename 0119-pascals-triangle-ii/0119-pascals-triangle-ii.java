class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans= new ArrayList<>();
        long anss=1;
        ans.add((int)anss);
        
        for(int i=1;i<=rowIndex;i++ ){
            anss=anss*(rowIndex-i+1);
            anss=anss/i;
            ans.add((int)anss);
        }
        return ans;
    }
}