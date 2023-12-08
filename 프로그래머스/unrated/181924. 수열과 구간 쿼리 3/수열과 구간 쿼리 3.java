class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer=new int[arr.length];
		for(int i=0;i<queries.length;i++) {
			
			int a;
			a=arr[queries[i][0]];
			arr[queries[i][0]]=arr[queries[i][1]];
			arr[queries[i][1]]=a;
			
		}
		for(int i =0;i<answer.length;i++) {
			answer[i]=arr[i];
		}
        return answer;
    }
}