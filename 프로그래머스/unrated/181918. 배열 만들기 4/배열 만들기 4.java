import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list= new ArrayList<>();
        
        for(int i=0;i<arr.length;i++) {
			if(list.isEmpty()==true) {
				list.add(arr[i]);
			}else if((list.isEmpty()!=true)&&
                     (list.get(list.size()-1)>=arr[i])) {
				list.remove(list.size()-1);
				i--;
			}else if((list.isEmpty()!=true)&&
                     (list.get(list.size()-1)<arr[i])) {
				list.add(arr[i]);
			}
			
		}
		
		int[] stk=new int[list.size()];
		for( int i=0;i<stk.length;i++) {
			stk[i]=list.get(i);
		}
        return stk;
    }
}