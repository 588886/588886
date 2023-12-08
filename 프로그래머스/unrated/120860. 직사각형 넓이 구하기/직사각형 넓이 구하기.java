class Solution {
    public int solution(int[][] dots) {
        int x=Math.abs( dots[0][0]-dots[1][0]!=0 ? 
                       dots[0][0]-dots[1][0]:dots[0][0]-dots[2][0] );
		int y=Math.abs( dots[0][1]-dots[1][1]!=0 ? 
                       dots[0][1]-dots[1][1]:dots[0][1]-dots[2][1] );
        return y*x;
    }
}