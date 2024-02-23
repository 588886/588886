import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        int[] alter=arr.clone();
		
		Arrays.sort(alter);
		
		ArrayList<Integer> answer=new ArrayList<>();
		
		for(int i:arr) {
			if(i!=alter[0])answer.add(i);
		}
        if(answer.size()==0)answer.add(-1);
        return answer;
    }
}