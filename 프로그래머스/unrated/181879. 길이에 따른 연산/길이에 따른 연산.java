class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        if(num_list.length>=11){
            answer = 0;
            for(int i : num_list){
                answer+=i;
            }
        }else{
            for(int i : num_list){
                answer=answer*i;
            }
        }
        return answer;
    }
}