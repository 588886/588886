class Solution {
    public String solution(String a, String b) {
        String answer = "";
		int mode = 0;
		String bs = a.length() > b.length() ? a : b;
		String ss = a.length() <= b.length() ? a : b;
		for(int i=0;i<bs.length();i++) {
			
			int bi = bs.charAt(bs.length()-1-i)-'0';
			int si = i<ss.length() ? ss.charAt(ss.length()-1-i)-'0':0;
			
			int sum = bi+si+mode;
			mode=sum/10;
			sum%=10;
			
			answer=sum+answer;
			
			
		}
		if(mode==1) {
			answer=1+answer;
		}
        return answer;
    }
}