class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
    	char[] ch=my_string.toCharArray();
        for(int i=ch.length-n;i<ch.length;i++){
            answer+=ch[i];
        }
        return answer;
    }
}