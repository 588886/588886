
import java.util.ArrayList;
class Solution {
    public  ArrayList<Integer> solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			
			if(flag[i]==true) {
				for(int i1 = 0; i1< arr[i];i1++) {
					list.add(arr[i]);
					list.add(arr[i]);
				}
			}else {
				for(int i1 = 0; i1< arr[i];i1++) {
					list.remove(list.size()-1);
				}
			}
			
		}
        return list;
    }
}