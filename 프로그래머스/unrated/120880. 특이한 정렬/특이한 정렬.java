import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Solution {
    public ArrayList<Integer> solution(int[] numlist, int n) {
        Integer[] nums=new Integer[numlist.length];
		for(int i=0;i<numlist.length;i++) {
			nums[i]=numlist[i];
		}
		Arrays.sort(nums,Collections.reverseOrder());
		ArrayList<Integer> answer= new ArrayList<Integer>();
		
		for(int i=0;i<10000;i++) {
			for(int num:nums) {
				if(Math.abs(num-n)==i)answer.add(num);
			}
		}
        return answer;
    }
}