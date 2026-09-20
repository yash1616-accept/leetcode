class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int x : nums) {
            set.add(x);
        }
        int k = 0;
        for (int x : set) {
            nums[k] = x;
            k++;
        }
        return k;
    }
}