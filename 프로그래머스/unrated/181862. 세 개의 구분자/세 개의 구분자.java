
import java.util.ArrayList;class Solution {
    public ArrayList<String> solution(String myStr) {
		String[] str=myStr.split("a|b|c");
        ArrayList<String> list = new ArrayList<String>();
		
		for(String s:str) {
			if(!s.equals("")) {
				list.add(s);
			}
		}
        if(list.size()==0){
            list.add("EMPTY");
        }
        return list;
    }
}