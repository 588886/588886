

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public ArrayList<String> solution(String myString) {
        String[] str=myString.split("x");
		Arrays.sort(str);
		ArrayList<String> list=new ArrayList<>();
		for(String i : str) {
        	if(!i.equals("")) {list.add(i);}
        }
        return list;
    }
}