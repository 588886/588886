class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String str;
    	
    	char[] controlStr=control.toCharArray();
    	for(int i=0;i<control.length();i++) {
    		str=controlStr[i]+"";
    		if(str.equals("w")) {
    			answer+=1;
    		}else if(str.equals("s")) {
    			answer-=1;
    		}else if(str.equals("d")) {
    			answer+=10;
    		}else if(str.equals("a")) {
    			answer-=10;
    		}
    	}
        return answer;
    }
}