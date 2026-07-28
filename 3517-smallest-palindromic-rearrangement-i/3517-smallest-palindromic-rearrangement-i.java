class Solution {
    public String smallestPalindrome(String s) {
       int freq[]= new int[26];
       //frequency count
       for(char x:s.toCharArray()){
        freq[x-'a']++;
       }
       //storage
       StringBuilder firsthalf = new StringBuilder();
      StringBuilder middle = new StringBuilder();
      
      for(int i=0;i<freq.length;i++){
        //fist half
         for(int j=0;j<freq[i]/2;j++){
            firsthalf.append((char)(i+'a'));
         }
         //middle
         if(freq[i]%2==1){
           middle.append((char)(i+'a'));
         }
      }
      StringBuilder secondhalf = new StringBuilder(firsthalf).reverse();
      return firsthalf.toString()+middle.toString()+secondhalf;
    }
}