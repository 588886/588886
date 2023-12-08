class Solution {
    public int[] solution(String my_string) {
        char[] ch=my_string.toCharArray();
		int[] answer=new int[52];
		for(int i=0;i<my_string.length();i++) {
			
			if(ch[i]<91) {
				
				answer[ch[i]-65]+=1;
				
			}else {
				answer[ch[i]-71]+=1;
			}
			
		}
        return answer;
    }
}