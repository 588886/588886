class Solution {
    public int solution(int n) {
        char[] ch=(n+"").toCharArray();
        int answer = 0;
        for(char c:ch){
            answer+=c-48;
        }
        return answer;
    }
}