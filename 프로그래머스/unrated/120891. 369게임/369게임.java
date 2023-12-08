class Solution {
    public int solution(int order) {
        char[] ch=(order+"").toCharArray();
		int answer = 0;
		for(char c:ch) {
			if((c==51)|(c==54)|(c==57)) {
				answer++;
			}
		}
        return answer;
    }
}