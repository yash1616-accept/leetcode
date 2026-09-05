class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        int freqs[]= new int[256];
        int freqt[]= new int [256];
        for(int i =0;i<s.length();i++){
          int a =s.charAt(i);
          int b= t.charAt(i);
          if(freqs[a]!=freqt[b])return false;
          freqs[a]=i+1;
          freqt[b]=i+1;
        }
        return true;
    }
}