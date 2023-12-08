import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);	
		ArrayList<Integer> list=new ArrayList<Integer>();//cnt등록목적
		int cnt=1;
        int maxCnt = 0; // 최빈값의 빈도수
		int answer=0;//최빈값
		if(array.length==1) {
			return array[0];
		}else {
			
			for (int i = 1; i < array.length; i++) {
                if (array[i] == array[i - 1]) {
                    cnt++;
                } else {
                    if (maxCnt < cnt) {
                        maxCnt = cnt;
                        answer = array[i - 1];
                    }
                    list.add(cnt);
                    cnt = 1;
                }
            }
            if (maxCnt < cnt) {
                answer = array[array.length - 1];
            }
            list.add(cnt);
			if(list.size()==1) {
            	answer=array[0];
            }else {
            	list.sort(Collections.reverseOrder());
            	if(list.get(0)==list.get(1)) {
            		answer=-1;
            	}
            	
            }
            return answer;
		}
        
    }
}