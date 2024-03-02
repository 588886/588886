import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {
        int numsHalfLangth=nums.length/2;
		HashSet<Integer> numsSet=new HashSet<>();
		for(int i:nums) {
			numsSet.add(i);
		}
        return numsHalfLangth>=numsSet.size() ? numsSet.size():numsHalfLangth;
    }
}