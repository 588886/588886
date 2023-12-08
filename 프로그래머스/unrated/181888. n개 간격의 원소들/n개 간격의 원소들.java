class Solution {
    public int[] solution(int[] num_list, int n) {
        int cnt;
		int co=0;
        int a= ((num_list.length-1)/n)+1;
        int[] answer = new int[a];
        for(cnt=0;cnt<num_list.length;cnt=cnt+n){
        	answer[co]=num_list[cnt];
        	co++;
        }
        return answer;
    }
}