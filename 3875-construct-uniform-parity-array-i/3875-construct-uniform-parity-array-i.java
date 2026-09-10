class Solution {
    public boolean uniformArray(int[] nums1) {
     boolean caneven=true;
     boolean canodd=true;
     for(int i=0;i<nums1.length;i++ ){
        boolean evenpossible=nums1[i]%2==0;
        boolean oddpossible=nums1[i]%2!=0;
        for(int j=0;j<nums1.length;j++){
            if(i==j)continue;
            int diff=nums1[i]-nums1[j];
            if(diff%2==0){
                evenpossible=true;
            }
            if(diff%2!=0){
                oddpossible=true;
            }
        }
        if(!evenpossible){
            caneven=false;
        }
        if(!oddpossible){
        canodd=false;
        }
     }
     return caneven||canodd;
    }
}