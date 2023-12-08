import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String myString) {
        String[] str=myString.split("x");
		ArrayList<Integer> answer=new ArrayList<>();
		for(String st:str) {
			answer.add(st.length());
		}
		
		if(myString.lastIndexOf("x")==myString.length()-1) {
			answer.add(0);
		}
        return answer;
    }
}