class Solution {
    public String solution(String rsp) {
        char[] ch=rsp.toCharArray();
        String answer = "";
        for(char c:ch){
            if(c==48){
                answer+="5"+"";
            }else if(c==50){
                answer+=""+"0";
            }else if(c==53){
                answer+="2"+"";
            }
        }
        return answer;
    }
}