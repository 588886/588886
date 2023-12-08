class Solution {
    public int solution(String myString, String pat) {
        
    	String str1 = myString.toLowerCase();
    	String str2 = pat.toLowerCase();
        int answer = answer = str1.contains(str2) ? 1 : 0;
        return answer;
    }
}