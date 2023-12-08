class Solution {
    public int solution(String myString, String pat) {
        int cnt=0;
		int answer=0;
		
		while(myString.indexOf(pat,cnt)!=-1) {
			
				cnt=myString.indexOf(pat,cnt)+1;
				answer++;
			
		}
        return answer;
    }
}