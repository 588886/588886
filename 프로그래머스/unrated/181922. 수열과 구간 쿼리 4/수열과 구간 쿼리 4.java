class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer=new int[arr.length];
		for(int i = 0; i<arr.length;i++) {
			answer[i]=arr[i];
		}

		
		for(int i=0;i<queries.length;i++) {
			for(int is = queries[i][0];is<=queries[i][1];is++) {
				
				if((is%queries[i][2])==0) {
					answer[is]=arr[is]+1;
					arr[is]=answer[is];
				}
			}
		}
        return answer;
    }
}