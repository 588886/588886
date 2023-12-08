import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int[] solution(int[] emergency) {
        Integer[] ex=new Integer[emergency.length];
		
		for(int i=0;i<emergency.length;i++) {
			ex[i]=emergency[i];
		}
		int answer[]=new int[emergency.length];
		Arrays.sort(ex,Collections.reverseOrder());
		
		for(int i=0;i<ex.length;i++) {
			
			for(int i1=0;i1<ex.length;i1++) {
				
				if(emergency[i]==ex[i1]) {
					answer[i]=i1+1;
				}
				
			}
			
		}
        return answer;
    }
}