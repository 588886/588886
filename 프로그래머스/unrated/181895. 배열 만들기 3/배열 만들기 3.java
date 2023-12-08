class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        String str="";
    	
    	for(int i=0;i<intervals.length;i++) {
    		
    		for(int i1=intervals[i][0];i1<=intervals[i][1];i1++) {
    			str+=arr[i1]+",";
    		}
    		
    	}
    	String[] strArray=str.split("\\,");
    	int[] answer=new int[strArray.length];
    	
    	for (int i = 0; i<strArray.length;i++) {
    		
    		answer[i]=Integer.parseInt(strArray[i]);
    	}
        return answer;
    }
}