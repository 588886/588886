import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        String[] str = my_string.split(" ");
				
		ArrayList<String> answer = new ArrayList<>();
		
		for(int i=0;i<str.length;i++) {
			
			if(!(str[i].equals(""))){
				answer.add(str[i]);
			}
			
		}
        String[] s=new String[answer.size()];
		for(int i =0;i<answer.size();i++) {
			s[i]=answer.get(i);
		}
        return s;
    }
}