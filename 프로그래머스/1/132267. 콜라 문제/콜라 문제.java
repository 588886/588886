class Solution {
    public int solution(int a, int b, int n) {
        int	answer=0;
		for(int i=0;i<1000000;i++) {
			answer+=n/a*b;
			n=(n/a*b)+(n%a);
			if(n==1||n==0) break;
		}
        return answer;
    }
}