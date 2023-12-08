class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] c=my_string.toCharArray();
        for(char ch:c){
            
            for(int i=0;i<n;i++){
                answer+=ch+"";
            }
            
        }
        return answer;
    }
}