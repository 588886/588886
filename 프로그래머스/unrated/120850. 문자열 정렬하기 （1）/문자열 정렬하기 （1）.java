
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public ArrayList<Integer> solution(String my_string) {
        char[] ch=my_string.toCharArray();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(char c:ch) {
			if(c<58) {
				list.add(c-48);
			}
		}
		list.sort(Comparator.naturalOrder());
        return list;
    }
}