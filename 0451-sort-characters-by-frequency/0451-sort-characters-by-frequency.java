class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
            
        }
        PriorityQueue<Character> q = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        q.addAll(map.keySet());
        StringBuilder string = new StringBuilder();

        while(!q.isEmpty()){
            char ch = q.poll();
            int count = map.get(ch);
            while(count-->0){
             string.append(ch);
            }
        }
        return string.toString();

    }
}