class Solution {
    public int solution(String my_string) {
        char[] ch=my_string.toCharArray();
        int answer = 0;
        for(char c:ch){
            if(c<=57){
                answer+=c-48;
            }
        }
        return answer;
    }
}