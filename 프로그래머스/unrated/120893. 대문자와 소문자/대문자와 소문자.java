class Solution {
    public String solution(String my_string) {
        char[] ch=my_string.toCharArray();
        String answer = "";
        for(char c:ch){
            if(c>=97){
                answer+=(c+"").toUpperCase();
            }else{
                answer+=(c+"").toLowerCase();
            }
        }
        return answer;
    }
}