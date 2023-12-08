import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] x=s.toCharArray();
		Arrays.sort(x);
		for(char c:x) {
			if(s.indexOf(c+"")==s.lastIndexOf(c+""))answer+=c+"";
		}
		
        return answer;
    }
}