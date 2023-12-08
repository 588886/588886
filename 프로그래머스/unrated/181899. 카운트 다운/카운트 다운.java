
import java.util.ArrayList;
class Solution {
    public int[] solution(int start, int end_num) {
        ArrayList<Integer> list = new ArrayList<Integer>();
    	
    	for(int i=start;i>=end_num;i-- ) {
    		
    		list.add(i);
    		
    	}
    	int[] answer = new int[list.size()];
    	for(int i=0;i<answer.length;i++) {
    		answer[i]=list.get(i);
    	}
        return answer;
    }
}