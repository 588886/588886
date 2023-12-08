class Solution {
    public String solution(String myString) {
        char[] str=myString.toCharArray();
		String answer="";
		for(char c:str) {
			
            answer= c<108 ? answer+"l":answer+c+"";
		}
        return answer;
    }
}