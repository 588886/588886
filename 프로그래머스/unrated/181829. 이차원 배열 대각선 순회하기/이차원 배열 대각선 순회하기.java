class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        for(int i=0;i<board.length;i++) {
			
			for(int i1=0;i1<board[0].length;i1++) {
				if(i+i1<=k) {
					answer+=board[i][i1];
				}
			}
		}
        return answer;
    }
}