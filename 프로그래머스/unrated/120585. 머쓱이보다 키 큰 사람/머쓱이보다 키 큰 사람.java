class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int st1:array) {
			
			if(st1>height) {
				answer++;
			}
			
		}
        return answer;
    }
}