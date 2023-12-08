class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        char[] str=my_string.toCharArray();
    	for(int i=0;i<str.length;i++) {
    		String st="";
    		for(int i1=i;i1<str.length;i1++) {
    			
    			st+=str[i1]+"";
    			
    		}
    		if(st.equals(is_suffix)) {
    			answer++;
    		}
    		
    	}
        return answer;
    }
}