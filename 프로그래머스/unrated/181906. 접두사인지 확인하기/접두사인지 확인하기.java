class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        char[] st= my_string.toCharArray();
    	
    	for(int i = my_string.length();i>=0;i--) {
    		String str = "";
    		for(int i1=0;i1<i;i1++) {
    			str+=st[i1];
    		}
    		if(str.equals(is_prefix)) {
    			answer++;
    		}
    		
    	}
        return answer;
    }
}