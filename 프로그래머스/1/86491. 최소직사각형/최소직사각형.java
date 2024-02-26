class Solution {
    public int solution(int[][] sizes) {
        int w=0;
		int h=0;
		for(int i=0;i<sizes.length;i++) {
			int big=sizes[i][0]>sizes[i][1] ? sizes[i][0]:sizes[i][1]; 
			int small=sizes[i][0]<=sizes[i][1] ? sizes[i][0]:sizes[i][1]; 
			if(w<big)w=big;
			if(h<small)h=small;
		}
        return w*h;
    }
}