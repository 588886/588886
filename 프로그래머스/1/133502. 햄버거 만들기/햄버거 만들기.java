import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] ingredient) {
        List<Integer> ingredientList=Arrays.stream(ingredient).boxed().collect(Collectors.toList());
		
		int count=0;
		for(int i=0;i<ingredientList.size();i++) {
			if(i>0&&i<ingredientList.size()-2&&ingredientList.get(i-1)==1&&ingredientList.get(i)==2&&ingredientList.get(i+1)==3&&ingredientList.get(i+2)==1) {
				ingredientList.remove(i+2);
				ingredientList.remove(i+1);
				ingredientList.remove(i);
				ingredientList.remove(i-1);
				count++;
				i=i-3; 
			}
		}
        return count;
    }
}