import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
class Solution {
    public String solution(String my_string) {
        String answer="";
		char[] ch=my_string.toCharArray();
		ArrayList<String> list=new ArrayList<String>();
		for(char c:ch) {
			list.add(c+"");
		}
		List<String> list3= list.stream().distinct().collect(Collectors.toList());
		for(String s:list3) {
			answer+=s;
//			System.out.println(s);
		}
        return answer;
    }
}