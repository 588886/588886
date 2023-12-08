import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int answer=array[0];
		for(int i:array) {
			if(Math.abs(n-i)<Math.abs(n-answer)) {
				answer=i;
			}
			
		}
        return answer;
    }
}