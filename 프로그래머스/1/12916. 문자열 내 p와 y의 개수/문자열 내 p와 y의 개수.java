class Solution {
    boolean solution(String s) {
        int answer=0;
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)+"").equals("p")||(s.charAt(i)+"").equals("P"))answer++;
			else if((s.charAt(i)+"").equals("y")||(s.charAt(i)+"").equals("Y"))answer--;
		}
        return answer==0 ? true:false;
    }
}