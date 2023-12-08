
import java.util.Arrays;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);
		char[] ch=my_string.toCharArray();
		int cnt=0;
		for(int i=0;i<ch.length;i++) {
			
			if(i==indices[cnt]) {
				
				if(cnt!=(indices.length-1)) {
					cnt++;
				}
				
				
			}else {
				answer+=ch[i]+"";
			}
			
		}
        return answer;
    }
}