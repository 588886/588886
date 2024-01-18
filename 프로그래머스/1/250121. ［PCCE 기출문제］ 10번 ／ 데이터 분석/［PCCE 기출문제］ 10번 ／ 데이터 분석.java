import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Solution {
    public ArrayList<int[]> solution(int[][] data, String ext, int val_ext, String sort_by) {
        int state=0;
		if(ext.equals("date"))state=1;
		if(ext.equals("maximum"))state=2;
		if(ext.equals("remain"))state=3;
		ArrayList<int[]> result=new ArrayList<>();
		for(int[] i: data) {
			if(i[state]<val_ext)result.add(i);
		}
		
		Comparator<int[]> comparator = null;
        if (sort_by.equals("date")) {
            comparator = Comparator.comparingInt(arr -> arr[1]);
        } else if (sort_by.equals("maximum")) {
            comparator = Comparator.comparingInt(arr -> arr[2]);
        } else if (sort_by.equals("remain")) {
            comparator = Comparator.comparingInt(arr -> arr[3]);
        } else if (sort_by.equals("code")) {
            comparator = Comparator.comparingInt(arr -> arr[0]);
        }
        
        Collections.sort(result, comparator);
        return result;
    }
}