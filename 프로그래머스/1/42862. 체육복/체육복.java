import java.util.HashMap;
import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
		Arrays.sort(reserve);
		HashMap<Integer, Integer> nums=new HashMap(n);
		for(int i=0;i<n;i++) {
			nums.put(i+1, 1);
		}
		for(int i=0;i<reserve.length;i++) {
			nums.put(reserve[i], 2);
		}
		for(int i=0;i<lost.length;i++) {
			if(nums.get(lost[i])==2) {
				nums.put(lost[i], 1);
			}else {
				nums.put(lost[i], 0);
			}
		}
		for(int i=0;i<lost.length;i++) {
			if(nums.get(lost[i])==0) {
				if(lost[i]>1&&lost[i]<n) {
					if(nums.get(lost[i]-1)==2) {
						nums.put(lost[i]-1, 1);
						nums.put(lost[i], 1);
					}else if(nums.get(lost[i]+1)==2) {
						nums.put(lost[i]+1, 1);
						nums.put(lost[i], 1);
					}else {
						nums.put(lost[i], 0);
					}
				}else if(lost[i]==1) {
					if(nums.get(lost[i]+1)==2) {
						nums.put(lost[i]+1, 1);
						nums.put(lost[i], 1);
					}else {
						nums.put(lost[i], 0);
					}
				}else if(lost[i]==n) {
					if(nums.get(lost[i]-1)==2) {
						nums.put(lost[i]-1, 1);
						nums.put(lost[i], 1);
					}else {
						nums.put(lost[i], 0);
					}
				}
			}
		}
		int count=n;
		for(int i=0;i<n;i++) {
			if(nums.get(i+1)==0)count--;
		}
        return count;
    }
}