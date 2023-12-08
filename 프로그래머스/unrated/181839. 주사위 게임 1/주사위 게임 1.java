class Solution {
    public int solution(int a, int b) {
        int answer;
        if((a%2==0)&&(b%2==0)) {
			answer=Math.abs(a-b);
		}else if((a%2==1)&&(b%2==1)) {
			answer=(a*a)+(b*b);
		}else {
			answer=(a+b)*2;
		}
        return answer;
    }
}