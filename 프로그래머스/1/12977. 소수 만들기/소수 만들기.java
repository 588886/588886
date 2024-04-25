import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int count=0;
		for(int i=0;i<nums.length-2;i++) {
			for(int k=i+1;k<nums.length-1;k++) {
				for(int j=k+1;j<nums.length;j++) {
					boolean primeNumber=true;
					for(int g=2;g<=(int)Math.sqrt(nums[i]+nums[j]+nums[k]);g++) {
						if((nums[i]+nums[j]+nums[k])%g==0) {
							primeNumber=false;
							break;
						}
					}
					if(primeNumber)count++;
				}
			}
		}

        return count;
    }
}