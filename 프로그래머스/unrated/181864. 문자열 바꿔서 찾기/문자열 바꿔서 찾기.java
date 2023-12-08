class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString=myString.replace("B", "b"); 
    	myString= myString.replace("A", "B");
    	myString= myString.replace("b", "A");
        if(myString.indexOf(pat)!=-1) {
            answer=1;
        };
        return answer;
    }
}