import java.util.ArrayList;
class Solution {
    public int solution(int[][] board, int[] moves) {
        ArrayList<Integer> tower=new ArrayList<>();
		int count=0;
		for(int i=0;i<moves.length;i++) {
			
			for(int k=0;k<board.length;k++) {
				if(board[k][moves[i]-1]!=0) {
					tower.add(board[k][moves[i]-1]);
					board[k][moves[i]-1]=0;
					while(tower.size()>=2&&tower.get(tower.size()-1)==tower.get(tower.size()-2)) {
						count+=2;
						System.out.println(tower.get(tower.size()-1));
						System.out.println(tower.get(tower.size()-2));
						tower.remove(tower.size()-1);
						tower.remove(tower.size()-1);
					}
					break;
				}
			}
		}
        return count;
    }
}