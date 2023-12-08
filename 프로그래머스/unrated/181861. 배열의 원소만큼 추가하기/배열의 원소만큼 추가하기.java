

import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			
			for(int i1=0;i1<arr[i];i1++) {
				list.add(arr[i]);
			}
			
		}
        return list;
    }
}