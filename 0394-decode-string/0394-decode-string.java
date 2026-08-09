class Solution {
    public String decodeString(String s) {
        Stack<Integer>numstack= new Stack<>();
        Stack<String>string= new Stack<>();
        String current="";
        int num=0;
        for(char ch:s.toCharArray()){

            if(Character.isDigit(ch)){
              num= num*10+(ch-'0');
            }else if(ch=='['){
                 numstack.push(num);
                 string.push(current);
                 num=0;
                 current="";

            }else if(ch==']'){
                int repeat=numstack.pop();
                String previous =string.pop();
                String temp="";
                for(int i=0;i<repeat;i++){
                  temp+=current;
                }
                current = previous+temp;

            }else{
                current+=ch;
            }
        }
        return current;
    }
}