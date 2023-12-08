
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();
		
		for(int i : arr) {
			
			list.add(i);
			
		}
		
		for(int i=0;i<query.length;i++) {
			
			if (i%2==0) {
				
				for(int i1=list.size()-1;i1>query[i];i1--) {
					
					list.remove(i1);
					
				}
				
			}else if(i%2==1) {
				
				for(int i1=query[i]-1;i1>=0;i1--) {
					
					list.remove(i1);
					
				}
				
			}
			
		}
		
		int[] answer=new int[list.size()];
		
		for(int i = 0;i<list.size();i++) {
			
			answer[i]=list.get(i);
			
		}
        return answer;
    }
}