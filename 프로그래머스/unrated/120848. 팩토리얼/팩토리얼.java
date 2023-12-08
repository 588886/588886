class Solution {
    public int solution(int n) {
        int c=1;
		int answer=0;
		for(int i=1;i<1000000000;i++) {
			
			c*=i;
			if(c>n) {
				answer=i-1;
				break;
			}
			
		}
        return answer;
    }
}