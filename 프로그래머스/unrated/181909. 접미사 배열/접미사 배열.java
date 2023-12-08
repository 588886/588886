
import java.util.ArrayList;
import java.util.Comparator;
class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<String>();
    	
    	char[] str=my_string.toCharArray();
    	for(int i=0;i<str.length;i++) {
    		String st="";
    		for(int i1=i;i1<str.length;i1++) {
    			
    			st+=str[i1]+"";
    			
    		}
    		list.add(st);
    		
    	}
    	
    	list.sort(Comparator.naturalOrder());
    	String[] answer = new String[list.size()];
    	for(int i = 0;i<list.size();i++) {
    		answer[i]=list.get(i);
    	}
        return answer;
    }
}