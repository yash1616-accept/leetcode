class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i =magazine.length()-1;
        while(i>=0){
            map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
            i--;
        }
        int j =ransomNote.length()-1;
        
        while(j>=0){
        char ch =ransomNote.charAt(j);
        if(!map.containsKey(ch)||map.get(ch)==0 )return false ;
            if(map.containsKey(ch)){
            map.put(ch,map.get(ch)-1);
            }
            j--;
        }
     return true;

    }
}