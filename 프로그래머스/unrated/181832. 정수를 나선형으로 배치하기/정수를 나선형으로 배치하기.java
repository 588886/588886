class Solution {
    public int[][] solution(int n) {
        int[][] answer=new int[n][n];
		int mode=1;
		int h=0;
		int y=0;
		int cnt=1;
		int cnt1=1;
		while(cnt!=(n*n)+1) {
			answer[y][h]=cnt;
			
			if(mode==1) { 
				
				if(h==n-cnt1) {
					mode=2;
					y++;
				}else {
					h++;
				}
				
			}else if(mode==2) { 
				
				if(y==n-cnt1) {
					mode=3;
					h--;
				}else {
					y++;
				}
				
			}else if(mode==3) { 
				
				if(h==cnt1-1) {
					mode=4;
					y--;
				}else {
					h--;
				}
				
			}else if(mode==4) { 
				
				if(y==cnt1) {
					mode=1;
					h++;
					cnt1++;
				}else {
					y--;
				}
				
				
			}
			
			cnt++;
			
		}
        return answer;
    }
}