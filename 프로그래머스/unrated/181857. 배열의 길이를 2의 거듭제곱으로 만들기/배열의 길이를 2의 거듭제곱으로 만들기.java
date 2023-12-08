
import java.util.ArrayList;class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i:arr) {
			list.add(i);
		}
		
		for(int i=1;i<=2000;i*=2) {
			
			if(i>list.size()) {
				list.add(0);
				i/=2;
			}else if(i==list.size()) {
				break;
			}
			
		}
        return list;
    }
}