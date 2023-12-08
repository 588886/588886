class Solution {
    public int[] solution(int[] num_list, int n) {
        String str="";
		
		for(int i = n;i<num_list.length;i++) {
			str+=num_list[i]+",";
		}
		for(int i =0;i<n;i++) {
			str+=num_list[i]+",";
		}
		String[] str1=str.split(",");
		
		int[] answer= new int[str1.length];
		
		for(int i = 0;i<str1.length;i++) {
			answer[i]=Integer.parseInt(str1[i]);
		}
        return answer;
    }
}