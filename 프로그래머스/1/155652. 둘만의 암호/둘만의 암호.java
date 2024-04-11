class Solution {
    public String solution(String s, String skip, int index) {
        char[] s_chars=s.toCharArray();
		String answer="";
		for(int i=0;i<s.length();i++) {
			int count=0;
			int skip_index=0;
			while(count<index) {
				count++;
				s_chars[i]= s_chars[i]==122 ? (char)97:(char)(s_chars[i]+1);
				while(skip.contains(s_chars[i]+"")) {
					s_chars[i]= s_chars[i]==122 ? (char)97:(char)(s_chars[i]+1);
				}
			}
		}
        for(char ch:s_chars) {
			answer+=ch;
		}
        return answer;
    }
}