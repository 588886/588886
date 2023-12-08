class Solution {
    public int solution(int[][] arr) {
        boolean a = true;
		for(int i=0;i<arr.length;i++) {
			
			for(int i1=0;i1<arr.length;i1++) {
				if(arr[i][i1]!=arr[i1][i]) {
					a=false;
				}
			}
		}
		int answer= a==true ? 1:0;
        return answer;
    }
}