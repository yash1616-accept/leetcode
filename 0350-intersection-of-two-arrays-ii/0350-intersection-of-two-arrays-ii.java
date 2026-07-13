class Solution {
    public int minimum(int a,int b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        int ans[] = new int[minimum(nums1.length,nums2.length)];
        int freq[] = new int[1001];
        for(int i=0;i<nums1.length;i++){
            freq[nums1[i]]++;
        }
        int j=0;
        for(int i=0;i<nums2.length;i++){
         if(freq[nums2[i]]>0){
            ans[j]=nums2[i];
         j++;
            freq[nums2[i]]--;
         }   

        }
        return Arrays.copyOf(ans,j);


        // HashMap<Integer, Integer> map = new HashMap<>();
        // ArrayList<Integer> arr = new ArrayList<>();
        // for (int i = 0; i < nums1.length; i++) {
        //     int a = nums1[i];
        //     map.put(a, map.getOrDefault(a, 0) + 1);
        // }
        // for (int i = 0; i < nums2.length; i++) {
        //     if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
        //         arr.add(nums2[i]);
        //         map.put(nums2[i], map.get(nums2[i]) - 1);
        //     }
        // }
        // int ans[] = new int[arr.size()];
        // for (int i = 0; i < arr.size(); i++) {
        //     ans[i] = arr.get(i);
        // }
        // return ans;
    }
}