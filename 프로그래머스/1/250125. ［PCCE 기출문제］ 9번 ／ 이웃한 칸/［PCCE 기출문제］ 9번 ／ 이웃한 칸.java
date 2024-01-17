class Solution {
    public int solution(String[][] board, int h, int w) {
        int result=0;
		
		if(h!=0&&board[h-1][w].equals(board[h][w]))result++;
		if(h!=board.length-1&&board[h+1][w].equals(board[h][w]))result++;
		if(w!=0&&board[h][w-1].equals(board[h][w])) result++;
		if(w!=board.length-1&&board[h][w+1].equals(board[h][w])) result++;
        return result;
    }
}