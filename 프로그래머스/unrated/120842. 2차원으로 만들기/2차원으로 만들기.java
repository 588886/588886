class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer=new int[num_list.length/n][n];
		for(int i=0;i<num_list.length;i+=n) {
			
			for(int i1=0;i1<n;i1++) {
				answer[i/n][i1]=num_list[i+i1];
			}
			
		}
        return answer;
    }
}