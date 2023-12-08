class Solution {
    public String solution(int age) {
        char[] ch=(age+"").toCharArray();
        String answer = "";
        for(char c:ch){
            answer+=(char)(c+49)+"";
        }
        return answer;
    }
}