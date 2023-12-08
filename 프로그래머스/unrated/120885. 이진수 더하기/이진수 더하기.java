class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int mode = 0;
		String bs = bin1.length() > bin2.length() ? bin1 : bin2;
		String ss = bin1.length() <= bin2.length() ? bin1 : bin2;
		for(int i=0;i<bs.length();i++) {
			
			int bi = bs.charAt(bs.length()-1-i)-'0';
			int si = i<ss.length() ? ss.charAt(ss.length()-1-i)-'0':0;
			
			int sum = bi+si+mode;
			mode=sum/2;
			sum%=2;
			
			answer=sum+answer;
			
			
		}
		if(mode==1) {
			answer=1+answer;
		}
        return answer;
    }
}