class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer=new int[queries.length];
		
		for(int i=0;i<queries.length;i++) {
			int anum = 1000001;
			for(int i1=queries[i][0];i1<=queries[i][1];i1++) {
				
				if((queries[i][2]<arr[i1])&&(anum>arr[i1])) {
					anum=arr[i1];
				}
				
			}
			if (anum==1000001) {
				answer[i]=-1;
			}else {
				answer[i]=anum;
			}
			
		}
        return answer;
    }
}