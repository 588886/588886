import java.util.*;
class Solution {
    public String solution(String my_string) {
        my_string=my_string.toLowerCase();
		char[] ch=my_string.toCharArray();
		Arrays.sort(ch);
		String answer="";
		for(char c:ch) {
			answer+=c+"";
		}
        return answer;
    }
}