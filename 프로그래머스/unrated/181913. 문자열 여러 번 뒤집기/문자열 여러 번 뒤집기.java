class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] my_strings=my_string.toCharArray();
    	
    	for(int i=0;i<queries.length;i++) {
    		String st="";
    		for(int i1=queries[i][0];i1<=queries[i][1];i1++) {
    			st+=my_strings[i1]+"";
    		}
    		
    		char[] st1=st.toCharArray();
    		for(int i1=queries[i][0];i1<=queries[i][1];i1++) {
    			my_strings[i1]=st1[st1.length-1+queries[i][0]-i1];
    		}
    		
    		
    	}
    	String answer = "";
    	for(int i=0;i<my_strings.length;i++) {
    		answer+=my_strings[i]+"";
    	}
        return answer;
    }
}