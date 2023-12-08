
import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        char[] ch1=before.toCharArray();
		char[] ch2=after.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean a=true;
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!=ch2[i]) {
				a=false;
			}
			
		}
		int answer=a==true ? 1:0;
        return answer;
    }
}