class Solution {
    public int solution(String number) {
        int answer = 0;
        char[] str= number.toCharArray();
    	
    	for(char i : str) {
    		answer+=i-48;
    	}
    	
    	answer=answer%9;
        return answer;
    }
}