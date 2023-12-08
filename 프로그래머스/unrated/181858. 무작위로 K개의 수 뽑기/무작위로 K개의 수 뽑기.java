

import java.util.ArrayList;
import java.util.Iterator;
class Solution {
    public ArrayList<Integer> solution(int[] arr, int k) {
        ArrayList<Integer> answer=new ArrayList<Integer>();
		
		for(int i : arr) {
			boolean a = false;
			Iterator<Integer> iter=answer.iterator();
			while(iter.hasNext()) {
				int in = iter.next();
				if(i==in) {
					a=true;
					break;
				}
			}
			if(a==false) {
				answer.add(i);
			}
			if(answer.size()==k) {
				break;
			}
		}
		if(answer.size()<k) {
			for(int i = answer.size();i<k;i++) {
				answer.add(-1);
			}
		}
        return answer;
    }
}