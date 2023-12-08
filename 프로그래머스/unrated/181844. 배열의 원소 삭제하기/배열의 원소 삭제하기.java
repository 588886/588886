
import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			boolean a = false;
			for(int i1:delete_list) {
				if(arr[i]==i1) {
					a=true;
				}
			}
			if(a==false) {
				list.add(arr[i]);
			}
		}
        return list;
    }
}