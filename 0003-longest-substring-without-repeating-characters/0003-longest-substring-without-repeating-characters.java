class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxlen = 0;
        boolean arr[] = new boolean[128];
        for (int right = 0; right < s.length(); right++) {
            while (arr[s.charAt(right)]) {
                arr[s.charAt(left)] = false;
                left++;
            }
            arr[s.charAt(right)] = true;
            int len = right - left + 1;
            maxlen = Math.max(maxlen, len);
        }
        return maxlen;
    }
}