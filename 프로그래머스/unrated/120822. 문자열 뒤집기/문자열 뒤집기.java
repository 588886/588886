class Solution {
    public String solution(String my_string) {
        char[] ch=my_string.toCharArray();
		String answer = "";
		for(int i=ch.length-1;i>=0;i--) {
			answer+=ch[i]+"";
		}
        return answer;
    }
}