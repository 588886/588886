import java.util.Stack;
class Solution {
    public String solution(String my_string, int s, int e) {
        String str1="";
		String answer="";
		Stack<Character> sta =new Stack<>();
		char[] st=my_string.toCharArray();
		for(int i = 0;i<my_string.length();i++) {
			
			if(i<s) {
				answer+=st[i]+"";
			}else if((s<=i)&&(i<=e)) {
				sta.push(st[i]);
				
				
			}else {
				str1+=st[i]+"";
			}
			
		}
		
	
		for(int i=0;i<=(e-s);i++) {
			answer+=sta.pop();
		}
		
		answer+=str1;
        return answer;
    }
}