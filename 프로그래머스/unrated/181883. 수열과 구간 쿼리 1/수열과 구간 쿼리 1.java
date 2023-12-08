class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
			
		for(int i1=0;i1<queries.length;i1++) {
			
			
			for(int i=queries[i1][0];i<=queries[i1][1];i++) {
				
				arr[i]+=1;
			}
			
		}
		for(int i=0;i<answer.length;i++) {
			
			answer[i]=arr[i];
		}
        return answer;
    }
}