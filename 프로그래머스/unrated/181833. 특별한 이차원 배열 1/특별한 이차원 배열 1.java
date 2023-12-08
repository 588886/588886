class Solution {
    public int[][] solution(int n) {
        int[][] answer=new int[n][n];
		
		for(int i=0;i<n;i++) {
			
			for(int i1=0;i1<n;i1++) {
				if(i==i1) {
					answer[i][i1]=1;
				}else {
					answer[i][i1]=0;
				}
				
				
			}
			
		}
        return answer;
    }
}