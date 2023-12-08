class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1=a+""+b;
    	int str2=2*a*b;
    	if(Integer.parseInt(str1)>=str2) {
    		answer=Integer.parseInt(str1);
    	}else {
    		answer=str2;
    	}
        return answer;
    }
}