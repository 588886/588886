import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        String[] stringN=(n+"").split("");
		
		Arrays.sort(stringN, Collections.reverseOrder());;
		String num="";
		for(String str:stringN) {
			num+=str;
		}
		return Long.parseLong(num);
    }
}