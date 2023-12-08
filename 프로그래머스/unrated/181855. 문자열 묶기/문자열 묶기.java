

import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int solution(String[] strArr) {
        Integer[] strL=new Integer[strArr.length];
		for(int i=0;i<strArr.length;i++) {
			strL[i]=strArr[i].length();
		}
		
		Arrays.sort(strL);
		
		int answer=0;
		int cnt=1;
		for(int i=1;i<strL.length;i++) {
			if(strL[i]==strL[i-1]) {
				cnt++;
			}else if(strL[i]!=strL[i-1]){
				if(cnt>answer) {
					answer=cnt;
					cnt=1;
				}else {
					cnt=1;
				}
			}
		}
		if(cnt>answer) {
			answer=cnt;
		}
        return answer;
    }
}