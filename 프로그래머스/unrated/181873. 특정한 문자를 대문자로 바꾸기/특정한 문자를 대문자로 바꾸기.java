class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char[] ch=my_string.toCharArray();
    	
    	for(char c:ch) {
    		if(Character.toString(c).equals(alp)){
    			answer+=(c+"").toUpperCase();
    		}else {
    			answer+=c+"";
    		}
    	}
        return answer;
    }
}