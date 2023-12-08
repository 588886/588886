class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char[] ch=my_string.toCharArray();
		
		for(int i =0;i<ch.length;i++) {
			
			if(i%m==c-1) {
				answer+=ch[i]+"";
			}
			
		}
        return answer;
    }
}