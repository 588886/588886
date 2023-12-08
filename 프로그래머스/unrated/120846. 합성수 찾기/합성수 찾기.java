class Solution {
    public int solution(int n) {
        int answer = 0;
		for(int i=4;i<=n;i++) {
			int cnt1=0;
			for(int i1=1;i1<=i;i1++) {
				
				if(i%i1==0) {
					cnt1++;
				}
				if(cnt1>=3) {
					answer++;
					break;
				}
			}
			
		}
        return answer;
    }
}