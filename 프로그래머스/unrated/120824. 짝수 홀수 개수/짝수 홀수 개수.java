class Solution {
    public int[] solution(int[] num_list) {
        int a=0;
        int b=0;
        for(int i:num_list){
            if(i%2==0){
                a++;
            }else{
                b++;
            }
        }
        int[] answer = {a,b};
        return answer;
    }
}