class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        char[] ch=code.toCharArray();
		
		for(int i =0;i<ch.length;i++) {
			
			if(i%q==r) {
				answer+=ch[i]+"";
			}
			
		}
        return answer;
    }
}