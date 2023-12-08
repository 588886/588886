class Solution {
    public String solution(String cipher, int code) {
        char[] ch=cipher.toCharArray();
        String answer = "";
        for(int i=1;i<=cipher.length();i++){
            if(i%code==0){
                answer+=ch[i-1]+"";
            }
        }
        return answer;
    }
}