class Solution {
    public String solution(String myString) {
        String answer = "";
        char[] ch=myString.toCharArray();
    	for(char c:ch) {
    		if(c==97) {
    			answer+=(char)(c-32)+"";
    		}else if(c==65){
                answer+=c+"";
            }else {
    			answer+=(c+"").toLowerCase();
    		}
    	}
        return answer;
    }
}