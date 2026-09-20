class Solution {
    public int singleNonDuplicate(int[] nums) {
        int num = 0;
        for (int x : nums) {
            num = num ^ x;
        }
        return num;
    }
}