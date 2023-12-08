class Solution {
    public int[][] solution(int[][] arr) {
        int hang = arr.length;
		int yul = arr[0].length;
		int x= hang > yul ? hang:yul;
		 int[][] answer=new int[x][x];
		if (hang > yul) {
			for (int i = 0; i < hang; i++) {
				for (int i1 = 0; i1 < hang; i1++) {
					
					answer[i][i1] = i1<yul ? arr[i][i1]:0;
					
				}
			}
		} else if (hang<=yul) {
			for (int i = 0; i < yul; i++) {

				for (int i1 = 0; i1 < yul; i1++) {
					
					answer[i][i1]= i<hang ? arr[i][i1]:0;
					
				}
			}
		}
        return answer;
    }
}