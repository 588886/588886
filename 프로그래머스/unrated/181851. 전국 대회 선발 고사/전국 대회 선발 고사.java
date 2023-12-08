import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<rank.length;i++) {
			if(attendance[i]) {
				list.add(rank[i]+","+i);
			}
		}
		
		int[][] r=new int[list.size()][2];
		for(int i=0;i<list.size();i++) {
			r[i][0]=Integer.parseInt(list.get(i).split(",")[0]);
			r[i][1]=Integer.parseInt(list.get(i).split(",")[1]);
		}
		
		Arrays.sort(r,new Comparator<int[]>() {
		    @Override
		    public int compare(int[] o1, int[] o2) {
		        return o1[0]-o2[0];
		    }
		});
		
		int answer=(r[0][1]*10000)+(r[1][1]*100)+r[2][1];
        return answer;
    }
}