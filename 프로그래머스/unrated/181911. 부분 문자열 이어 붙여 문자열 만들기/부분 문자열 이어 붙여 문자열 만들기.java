class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i=0;i<parts.length;i++) {
    		char[] ch=my_strings[i].toCharArray();
    		
    		for(int i1=parts[i][0];i1<=parts[i][1];i1++) {
    			answer+=ch[i1]+"";
    			
    		}
    		
    	}
        return answer;
    }
}