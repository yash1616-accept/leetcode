class Solution {
    public String makeSmallestPalindrome(String s) {
        int i =0;
        char ch []= s.toCharArray();
        int j=ch.length-1;
        while(i<j){
            if(ch[i]<ch[j]){
                ch[j]=ch[i];
            }else if(ch[j]<ch[i]){
                   ch[i]=ch[j];
            }
            i++;
            j--;
        }
        String str = new String(ch);
        return str;
    }
}