class Solution {
    public int solution(int[][] board) {
        int[][] board2=new int[board.length][board.length];
		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board.length; j++) {

				board2[i][j]=board[i][j];

			}

		}
		int answer = 0;
		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board.length; j++) {

				if (board[i][j] == 1) {

					if (i != 0 && j != 0) {
						board2[i - 1][j - 1] = 1;
					} 
					if (i != 0) {
						board2[i - 1][j] = 1;
					} 
					if (j != 0) {
						board2[i][j - 1] = 1;
					} 
					if (i != board.length - 1 && j != board.length - 1) {
						board2[i + 1][j + 1] = 1;
					} 
					if (i != board.length - 1) {
						board2[i + 1][j] = 1;
					} 
					if (j != board.length - 1) {
						board2[i][j + 1] = 1;
					} 
					if (i != 0 && j != board.length - 1) {
						board2[i - 1][j + 1] = 1;
					} 
					if (j != 0 && i != board.length - 1) {
						board2[i + 1][j - 1] = 1;
					}

				}

			}

		}
		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board.length; j++) {

				if (board2[i][j] == 0) {

					answer++;

				}

			}

		}

        return answer;
    }
}