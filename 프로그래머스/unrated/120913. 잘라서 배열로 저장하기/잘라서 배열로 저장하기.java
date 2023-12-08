
import java.util.ArrayList;
class Solution {
    public ArrayList<String> solution(String my_str, int n) {
        String[] st=my_str.split("");
		String str="";
		ArrayList<String> answer=new ArrayList<String>();
		
		for(int i=0;i<st.length;i++) {
			str+=st[i];
			if((i+1)%n==0) {
				answer.add(str);
				str="";
			}
		}
		if(!str.equals(""))answer.add(str);
        return answer;
    }
}