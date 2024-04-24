import java.util.HashSet;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        HashSet<Integer> nums=new HashSet<>(); 
		for(int i=0;i<6;i++) {
			nums.add(win_nums[i]);
		}
		
		int winCount=0;
		int zeroCount=0;
		
		for(int i=0;i<6;i++) {
			if(lottos[i]==0) {
				zeroCount++;
			}else if(nums.contains(lottos[i])){
				winCount++;
			}
		}
		
		int[] answer = {7-(winCount+zeroCount)<6 ? 7-(winCount+zeroCount) : 6,7-winCount<6 ? 7-winCount : 6};
        return answer;
    }
}