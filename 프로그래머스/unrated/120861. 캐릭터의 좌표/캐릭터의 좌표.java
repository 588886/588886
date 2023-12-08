class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int result[]={0,0};
		for(String key:keyinput) {
			if(key.equals("left")&&result[0]!=-(board[0]/2)) {
				result[0]-=1;
			}else if(key.equals("right")&&result[0]!=(board[0]/2)) {
				result[0]+=1;
			}else if(key.equals("up")&&result[1]!=(board[1]/2)) {
				result[1]+=1;
			}else if(key.equals("down")&&result[1]!=-(board[1]/2)) {
				result[1]-=1;
			}
		}
        return result;
    }
}