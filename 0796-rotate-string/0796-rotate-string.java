class Solution {
    public boolean rotateString(String s, String goal) {
        for(int i=0;i<s.length();i++){
            if(s.equals(goal)){
                return true;
            }
            char last = s.charAt(s.length()-1);
            s= last+s.substring(0,s.length()-1);
        }
        return false;
    }
}